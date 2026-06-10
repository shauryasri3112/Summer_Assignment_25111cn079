import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it's palindrome:");
        int n = sc.nextInt();
        int ori = n;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(ori == rev){
            System.out.println("The entered number is a palindrome.");
        } else {
            System.out.println("The entered number is not a palindrome.");
        }
    }
}