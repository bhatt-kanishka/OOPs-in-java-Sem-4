import java.util.Scanner;

public class Thread1 {

    // Ticket Booking class
    static class TicketBooking {
        private int availableSeats;

        public TicketBooking(int seats) {
            this.availableSeats = seats;
        }

        // synchronized method to prevent overbooking
        public synchronized void bookTickets(String userName, int seatsRequested) {
            System.out.println(userName + " is trying to book " + seatsRequested + " ticket(s)...");

            if (seatsRequested <= availableSeats) {
                System.out.println("Booking in progress for " + userName + "...");

                try {
                    Thread.sleep(1000); // simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                availableSeats -= seatsRequested;
                System.out.println("Booking successful for " + userName);
                System.out.println("Seats remaining: " + availableSeats + "\n");
            } else {
                System.out.println("Booking failed for " + userName + " (Not enough seats)");
                System.out.println("Seats remaining: " + availableSeats + "\n");
            }
        }
    }

    // User thread
    static class User extends Thread {
        private TicketBooking bookingSystem;
        private int seatsToBook;

        public User(String name, TicketBooking bookingSystem, int seatsToBook) {
            super(name);
            this.bookingSystem = bookingSystem;
            this.seatsToBook = seatsToBook;
        }

       // @Override
        public void run() {
            bookingSystem.bookTickets(getName(), seatsToBook);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total seats
        System.out.print("Enter total number of seats: ");
        int totalSeats = sc.nextInt();

        TicketBooking bookingSystem = new TicketBooking(totalSeats);

        // Input number of users
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        User[] users = new User[n];

        // Taking input for each user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of user " + (i + 1) + ": ");
            String name = sc.next();

            System.out.print("Enter seats to book for " + name + ": ");
            int seats = sc.nextInt();

            users[i] = new User(name, bookingSystem, seats);
        }

        // Start all threads
        for (int i = 0; i < n; i++) {
            users[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < n; i++) {
            try {
                users[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All bookings completed.");
        sc.close();
    }
}