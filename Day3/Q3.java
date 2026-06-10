import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to find GCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a != b){
            if(a > b){
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("The GCD of the entered numbers is: " + a);
    }
}
