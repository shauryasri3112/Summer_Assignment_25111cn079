import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an Armstrong number:");
        int n = sc.nextInt();
        int ori = n;
        int sum = 0;
        int digit;
        while(n > 0){
            digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if(ori == sum){
            System.out.println("The entered number is an Armstrong number.");
        } else {
            System.out.println("The entered number is not an Armstrong number.");
        }
    }
}
