import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to find LCM:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a > b) ? a : b;
        while(lcm % a != 0 || lcm % b != 0){
            lcm++;
        }
        System.out.println("The LCM of the entered numbers is: " + lcm);
    }
}
