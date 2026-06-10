import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check strong number:");
        int n = sc.nextInt();
        int ori = n;
        int sum = 0;
        int fact;
        while(n > 0){
            fact = 1;
            int digit = n % 10;
            for(int i = 1; i <= digit; i++){
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if(ori == sum){
            System.out.println("The entered number is a strong number.");
        } else {
            System.out.println("The entered number is not a strong number.");
        }
    }
}
