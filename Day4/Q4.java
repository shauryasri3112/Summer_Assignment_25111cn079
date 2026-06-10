import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which we need to print Armstrong numbers:");
        int n = sc.nextInt();
        System.out.println("Armstrong numbers up to " + n + " are:");
        for(int i = 1; i <= n; i++){
            int ori = i;
            int sum = 0;
            int digit;
            int temp = i;
            while(temp > 0){
                digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if(ori == sum){
                System.out.print(ori + " ");
            }
        }
    }
}