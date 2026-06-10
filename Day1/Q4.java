import java.util.Scanner;
class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number count the digits:");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        System.out.println("The number of digits in the entered number is: " + count);
    }
}