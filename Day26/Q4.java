import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== JAVA QUIZ =====");

        // Question 1
        System.out.println("1. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. static");
        System.out.println("4. void");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 2)
            score++;

        // Question 2
        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. execute()");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3)
            score++;

        // Question 3
        System.out.println("\n3. Java is a ______ language.");
        System.out.println("1. Procedural");
        System.out.println("2. Object-Oriented");
        System.out.println("3. Assembly");
        System.out.println("4. Machine");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 2)
            score++;

        // Question 4
        System.out.println("\n4. Which symbol is used to end a statement in Java?");
        System.out.println("1. .");
        System.out.println("2. :");
        System.out.println("3. ;");
        System.out.println("4. ,");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3)
            score++;

        // Question 5
        System.out.println("\n5. Which data type stores whole numbers?");
        System.out.println("1. float");
        System.out.println("2. char");
        System.out.println("3. int");
        System.out.println("4. boolean");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3)
            score++;

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + " out of 5");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}