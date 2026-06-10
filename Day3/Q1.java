import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number to check if number is prime:");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i*i <= n; i++){
                if(n % i == 0){
                  
            System.out.println("The entered number is not a prime number.");
        }
    }
}
    }
}

