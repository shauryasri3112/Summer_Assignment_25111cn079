
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = 0;
        String empName = "";
        double basicSalary = 0, hra = 0, da = 0, netSalary = 0;

        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Display Salary Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();

                    System.out.println("Employee details saved successfully.");
                    break;

                case 2:
                    hra = basicSalary * 0.20;   // 20% HRA
                    da = basicSalary * 0.10;    // 10% DA
                    netSalary = basicSalary + hra + da;

                    System.out.println("Salary calculated successfully.");
                    break;

                case 3:
                    System.out.println("\n----- Salary Details -----");
                    System.out.println("Employee ID   : " + empId);
                    System.out.println("Employee Name : " + empName);
                    System.out.println("Basic Salary  : " + basicSalary);
                    System.out.println("HRA           : " + hra);
                    System.out.println("DA            : " + da);
                    System.out.println("Net Salary    : " + netSalary);
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