import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("program to covert binary number to decimal--Enter the number:");
        String binary = sc.next();
        int decimal = 0;
        int power = 1;
        for(int i = binary.length() - 1; i >= 0; i--){
            int digit = binary.charAt(i) - '0';
            decimal += digit * power;
            power *= 2;
        }
        System.out.println("The decimal representation of the entered binary number is: " + decimal);
    }
}
