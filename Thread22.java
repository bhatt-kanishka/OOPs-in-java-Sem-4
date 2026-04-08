import java.util.Scanner;

public class Thread22 {

    // Bank Account Class (Shared Resource)
    static class BankAccount {
        private int balance;

        public BankAccount(int balance) {
            this.balance = balance;
        }

        // synchronized deposit method
        public synchronized void deposit(String name, int amount) {
            System.out.println(name + " is depositing: " + amount);
            balance += amount;
            System.out.println("Updated Balance after deposit: " + balance);
            System.out.println("----------------------------------");
        }

        // synchronized withdrawal method
        public synchronized void withdraw(String name, int amount) {
            System.out.println(name + " is trying to withdraw: " + amount);

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful for " + name);
            } else {
                System.out.println("Withdrawal failed for " + name + " (Insufficient balance)");
            }

            System.out.println("Current Balance: " + balance);
            System.out.println("----------------------------------");
        }

        public int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial Balance
        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();

        BankAccount account = new BankAccount(initialBalance);

        // Number of users
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        Thread[] users = new Thread[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter user name: ");
            String name = sc.next();

            System.out.print("Enter operation (deposit/withdraw): ");
            String operation = sc.next();

            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            // Thread creation
            users[i] = new Thread(() -> {
                if (operation.equalsIgnoreCase("deposit")) {
                    account.deposit(name, amount);
                } else if (operation.equalsIgnoreCase("withdraw")) {
                    account.withdraw(name, amount);
                } else {
                    System.out.println("Invalid operation by " + name);
                }
            });
        }

        // Start all threads
        for (int i = 0; i < n; i++) {
            users[i].start();
        }

        // Wait for all threads to finish
        try {
            for (int i = 0; i < n; i++) {
                users[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final Balance
        System.out.println("Final Balance: " + account.getBalance());

        sc.close();
    }
}