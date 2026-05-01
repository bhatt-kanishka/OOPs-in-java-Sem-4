class BankAccount {
 private double balance;

 BankAccount(double balance) {
  this.balance = balance;
 }

 double getBalance() {
  return balance;
 }

 double calculateInterest() {
  return 0;
 }
}

class Savings extends BankAccount {
 Savings(double balance) {
  super(balance);
 }

 double calculateInterest() {
  return getBalance() * 0.05;
 }
}

class Current extends BankAccount {
 Current(double balance) {
  super(balance);
 }

 double calculateInterest() {
  return getBalance() * 0.02;
 }
}

class TestBank {
 public static void main(String[] args) {
  System.out.println("Name: Kanishka Bhatt, Batch: 4, SAP ID: 590017366");

  BankAccount acc;
  acc = new Savings(1000);
  System.out.println("Output of the code for Savings Interest is: " + acc.calculateInterest());

  acc = new Current(1000);
  System.out.println("Output of the code for Current Interest is: " + acc.calculateInterest());
 }
}