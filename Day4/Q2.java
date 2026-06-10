import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find nth term of Fibonacci series:");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        if(n == 0){
            System.out.println("The " + n + "th term of the Fibonacci series is: " + a);
        } else if(n == 1){
            System.out.println("The " + n + "th term of the Fibonacci series is: " + b);
        } else {
            for(int i = 2; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("The " + n + "th term of the Fibonacci series is: " + b);
        }
    }
}