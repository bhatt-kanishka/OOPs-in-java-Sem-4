import java.util.Scanner;

public class Thread1 {

    // Ticket Booking Class
    static class TicketBooking {
        private int availableSeats;

        public TicketBooking(int seats) {
            this.availableSeats = seats;
        }

        // synchronized method to avoid overbooking
        public synchronized void bookTicket(String name, int seats) {
            System.out.println(name + " is trying to book " + seats + " seats");

            if (seats <= availableSeats) {
                System.out.println("Booking successful for " + name);
                availableSeats -= seats;
                System.out.println("Remaining seats: " + availableSeats);
            } else {
                System.out.println("Booking failed for " + name + " (Not enough seats)");
            }
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total seats
        System.out.print("Enter total seats: ");
        int totalSeats = sc.nextInt();

        TicketBooking booking = new TicketBooking(totalSeats);

        // Input number of users
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        Thread[] users = new Thread[n];

        // Taking input for each user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter user name: ");
            String name = sc.next();

            System.out.print("Enter seats required: ");
            int seats = sc.nextInt();

            // Creating thread using lambda
            users[i] = new Thread(() -> {
                booking.bookTicket(name, seats);
            });
        }

        // Start all threads
        for (int i = 0; i < n; i++) {
            users[i].start();
        }

        sc.close();
    }
}