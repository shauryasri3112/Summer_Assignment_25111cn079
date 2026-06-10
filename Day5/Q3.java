import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print factors of it ");
        int n = sc.nextInt();
        System.out.println("The factors of the entered number are:");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}