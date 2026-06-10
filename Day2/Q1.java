import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to find the sum of it's digits:");
int n = sc.nextInt();
int sum = 0;
while(n > 0){
    sum += n % 10;
    n /= 10;
}
System.out.println("The sum of the digits in the entered number is: " + sum);
    }
}