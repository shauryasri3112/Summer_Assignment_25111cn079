import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Write a program to check perfect number--Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println("The entered number is a perfect number.");
        } else {
            System.out.println("The entered number is not a perfect number.");
        }
}
}
