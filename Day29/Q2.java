import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int n = 0;
        int choice;

        do {
            System.out.println("\n===== MENU DRIVEN ARRAY OPERATIONS =====");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Find Largest Element");
            System.out.println("4. Find Smallest Element");
            System.out.println("5. Find Sum of Elements");
            System.out.println("6. Search an Element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements (max 10): ");
                    n = sc.nextInt();

                    System.out.println("Enter the elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Largest Element: " + max);
                    break;

                case 4:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Smallest Element: " + min);
                    break;

                case 5:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of Elements: " + sum);
                    break;

                case 6:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}