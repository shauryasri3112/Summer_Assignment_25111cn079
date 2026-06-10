import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find largest prime factor:");
        int n = sc.nextInt();
        int largestPrimeFactor = 1;
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                largestPrimeFactor = i;
                n /= i;
            }
        }
        System.out.println("The largest prime factor of the entered number is: " + largestPrimeFactor);
    }
}
