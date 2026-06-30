
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[10];
        String[] name = new String[10];
        double[] marks = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter Roll Number: ");
                        rollNo[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextDouble();

                        count++;
                        System.out.println("Student record added successfully.");
                    } else {
                        System.out.println("Record is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\nRoll No\tName\t\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == search) {
                            System.out.println("Student Found");
                            System.out.println("Roll No : " + rollNo[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Marks   : " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}