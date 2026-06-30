import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        String phone = "";
        String email = "";

        int choice;

        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Update Phone Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    email = sc.nextLine();

                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    System.out.println("\n----- Contact Details -----");
                    System.out.println("Name         : " + name);
                    System.out.println("Phone Number : " + phone);
                    System.out.println("Email        : " + email);
                    break;

                case 3:
                    System.out.print("Enter New Phone Number: ");
                    phone = sc.nextLine();
                    System.out.println("Phone number updated successfully.");
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}