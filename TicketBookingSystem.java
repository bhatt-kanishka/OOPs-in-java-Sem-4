class Thread1 {

    // 1. Ticket Booking class with limited seats
    static class TicketBooking {
        private int availableSeats;

        public TicketBooking(int seats) {
            this.availableSeats = seats;
        }

        // synchronized method to prevent overbooking
        public synchronized void bookTickets(String userName, int seatsRequested) {
            System.out.println(userName + " is trying to book " + seatsRequested + " ticket(s)...");

            if (seatsRequested <= availableSeats) {
                System.out.println("Seats available. Booking in progress for " + userName + "...");
                
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

    // 2. Thread class representing users
    static class User extends Thread {
        private TicketBooking bookingSystem;
        private int seatsToBook;

        public User(String name, TicketBooking bookingSystem, int seatsToBook) {
            super(name);
            this.bookingSystem = bookingSystem;
            this.seatsToBook = seatsToBook;
        }

        @Override
        public void run() {
            bookingSystem.bookTickets(getName(), seatsToBook);
        }
    }

    public static void main(String[] args) {

        TicketBooking bookingSystem = new TicketBooking(5); // limited seats

        // 2. Multiple users (threads)
        User user1 = new User("User-1", bookingSystem, 2);
        User user2 = new User("User-2", bookingSystem, 2);
        User user3 = new User("User-3", bookingSystem, 2);
        User user4 = new User("User-4", bookingSystem, 1);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}