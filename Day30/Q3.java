import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] empId = new int[10];
        String[] empName = new String[10];
        double[] salary = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();

                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee list is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\n----- Employee Details -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Employee ID   : " + empId[i]);
                            System.out.println("Employee Name : " + empName[i]);
                            System.out.println("Salary        : " + salary[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empName[i].equalsIgnoreCase(search)) {
                            System.out.println("Employee Found");
                            System.out.println("Employee ID   : " + empId[i]);
                            System.out.println("Employee Name : " + empName[i]);
                            System.out.println("Salary        : " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int id = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == id) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Mini Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}