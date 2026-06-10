import java.util.Scanner;

public class Q4 {

    static int rev = 0;

    static void reverse(int n) {
        if (n == 0)
            return;

        rev = rev * 10 + n % 10;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        reverse(num);

        System.out.println("Reversed number = " + rev);

        
    }
}