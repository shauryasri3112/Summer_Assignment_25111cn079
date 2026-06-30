import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 50;
        int availableSeats = totalSeats;
        int choice, tickets;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Tickets");
            System.out.println("2. Cancel Tickets");
            System.out.println("3. Check Available Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    tickets = sc.nextInt();

                    if (tickets <= availableSeats) {
                        availableSeats = availableSeats - tickets;
                        System.out.println(tickets + " ticket(s) booked successfully.");
                    } else {
                        System.out.println("Sorry! Only " + availableSeats + " seat(s) are available.");
                    }
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    tickets = sc.nextInt();

                    if (availableSeats + tickets <= totalSeats) {
                        availableSeats = availableSeats + tickets;
                        System.out.println(tickets + " ticket(s) cancelled successfully.");
                    } else {
                        System.out.println("Invalid number of tickets.");
                    }
                    break;

                case 3:
                    System.out.println("Available Seats: " + availableSeats);
                    System.out.println("Booked Seats: " + (totalSeats - availableSeats));
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}