import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNo = 0;
        String name = "";
        double marks = 0;

        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display Student Record");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks = sc.nextDouble();

                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    System.out.println("\n----- Student Record -----");
                    System.out.println("Roll Number : " + rollNo);
                    System.out.println("Name        : " + name);
                    System.out.println("Marks       : " + marks);
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}