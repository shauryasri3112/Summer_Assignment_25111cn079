import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("program to convert decimal number to binary Enter the number:");
        int n = sc.nextInt();
        String binary = "";
        while(n > 0){
            int rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }
        System.out.println("The binary representation of the entered number is: " + binary);
    }
}
