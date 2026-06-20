import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = Sc.nextInt();

        int arr[] = new int[n - 1];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = Sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        int total = n * (n + 1) / 2;

        int missing = total - sum;

        System.out.println("Missing number is: " + missing);
    }
}
    