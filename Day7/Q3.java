
import java.util.Scanner;

public class Q3 {

    static int sumDigits(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int sum = sumDigits(num);

        System.out.println("Sum of digits = " + sum);

        
    }
}