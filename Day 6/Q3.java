import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to count set bits:");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        System.out.println("The number of set bits in the entered number is: " + count);
    }
}
