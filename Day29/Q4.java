import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productId = 0;
        String productName = "";
        int quantity = 0;
        double price = 0;

        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    productId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    productName = sc.nextLine();

                    System.out.print("Enter Product Quantity: ");
                    quantity = sc.nextInt();

                    System.out.print("Enter Product Price: ");
                    price = sc.nextDouble();

                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.println("\n----- Product Details -----");
                    System.out.println("Product ID      : " + productId);
                    System.out.println("Product Name    : " + productName);
                    System.out.println("Quantity        : " + quantity);
                    System.out.println("Price           : Rs. " + price);
                    System.out.println("Total Value     : Rs. " + (quantity * price));
                    break;

                case 3:
                    System.out.print("Enter New Quantity: ");
                    quantity = sc.nextInt();
                    System.out.println("Quantity updated successfully.");
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