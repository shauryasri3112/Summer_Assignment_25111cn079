
import java.util.Scanner;

public class Q4 {

    static int[] roll = new int[10];
    static String[] name = new String[10];
    static double[] marks = new double[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    updateMarks(sc);
                    break;

                case 5:
                    deleteStudent(sc);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }

    // Function to Add Student
    static void addStudent(Scanner sc) {
        if (count == 10) {
            System.out.println("Record Full");
            return;
        }

        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;
        System.out.println("Student Added Successfully");
    }

    // Function to Display Students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found");
            return;
        }

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < count; i++) {
            System.out.println("Roll No : " + roll[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Marks   : " + marks[i]);
            System.out.println();
        }
    }

    // Function to Search Student
    static void searchStudent(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(search)) {
                System.out.println("Student Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    // Function to Update Marks
    static void updateMarks(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextDouble();
                System.out.println("Marks Updated Successfully");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    // Function to Delete Student
    static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {

                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;
                found = true;
                System.out.println("Student Deleted Successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }
}