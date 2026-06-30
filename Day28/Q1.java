import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookId = 0;
        String bookName = "";
        String author = "";
        boolean issued = false;

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Book Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author = sc.nextLine();

                    issued = false;

                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (!issued) {
                        issued = true;
                        System.out.println("Book issued successfully.");
                    } else {
                        System.out.println("Book is already issued.");
                    }
                    break;

                case 3:
                    if (issued) {
                        issued = false;
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book is already available in the library.");
                    }
                    break;

                case 4:
                    System.out.println("\n----- Book Details -----");
                    System.out.println("Book ID      : " + bookId);
                    System.out.println("Book Name    : " + bookName);
                    System.out.println("Author       : " + author);
                    System.out.println("Status       : " + (issued ? "Issued" : "Available"));
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}