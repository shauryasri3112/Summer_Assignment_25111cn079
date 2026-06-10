import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which we need to find factorial:");
        int n = sc.nextInt();
        int fact=1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("The factorial of Entered number is: " + fact);
    }

}