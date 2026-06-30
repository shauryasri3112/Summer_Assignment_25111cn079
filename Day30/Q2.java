import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[10];
        String[] bookName = new String[10];
        String[] author = new String[10];
        boolean[] issued = new boolean[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter Book ID: ");
                        bookId[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        bookName[count] = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        author[count] = sc.nextLine();

                        issued[count] = false;
                        count++;

                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\n----- Book Details -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Book ID   : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author    : " + author[i]);
                            System.out.println("Status    : " + (issued[i] ? "Issued" : "Available"));
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(search)) {
                            System.out.println("Book Found");
                            System.out.println("Book ID   : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author    : " + author[i]);
                            System.out.println("Status    : " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issueId) {
                            found = true;

                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == returnId) {
                            found = true;

                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book is already available.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the Mini Library System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}