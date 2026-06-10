import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which we need to find Multiplication Table");
        int n = sc.nextInt();
        int Mul = 1;
        for(int i = 1; i <= n; i++){

        
            Mul *= i;
        System.out.println("The Multiplication Table of Entered number is: " + Mul);
    }
}
}
