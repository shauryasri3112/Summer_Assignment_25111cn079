import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find product of digits:");
        int n= sc.nextInt();
        int product = 1;
        while(n > 0){
            product *= n % 10;
            n /= 10;
        }
        System.out.println("The product of the digits in the entered number is: " + product);
    }
}
