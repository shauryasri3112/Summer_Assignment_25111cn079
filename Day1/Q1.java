import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count the digits:");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
    }

System.out.println("Enter the number to find the sum of n natural numbers:");
int n = sc.nextInt();
int sum = 0;
for(int i = 1; i <= n; i++){
    sum += i;
}
System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}