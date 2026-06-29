
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int sub1, sub2, sub3, sub4, sub5;
        int total;
        double percentage;
        char grade;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks of Subject 1: ");
        sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        sub3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        sub4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        sub5 = sc.nextInt();

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = total / 5.0;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Subject 1    : " + sub1);
        System.out.println("Subject 2    : " + sub2);
        System.out.println("Subject 3    : " + sub3);
        System.out.println("Subject 4    : " + sub4);
        System.out.println("Subject 5    : " + sub5);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);

        if (percentage >= 40) {
            System.out.println("Result       : Pass");
        } else {
            System.out.println("Result       : Fail");
        }

        sc.close();
    }
}