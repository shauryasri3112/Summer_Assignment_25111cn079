import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number till which fibonacci series needs to be printed:");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("The Fibonacci series up to " + n + " is: ");
        while(a <= n){
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}