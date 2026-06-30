import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNumber = 0;
        String accountHolder = "";
        double balance = 0;

        int choice;

        do {
            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    accountHolder = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();

                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount deposited successfully.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("\n----- Account Details -----");
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Account Holder : " + accountHolder);
                    System.out.println("Current Balance: Rs. " + balance);
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank Account System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}