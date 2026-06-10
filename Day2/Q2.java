import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which we need to find reverse:");
        int n = sc.nextInt();
        int reverse = 0;
        while(n > 0){
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        System.out.println("The reverse of the entered number is: " + reverse);
    }
}
