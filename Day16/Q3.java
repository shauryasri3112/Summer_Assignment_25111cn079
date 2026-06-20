import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = Sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        System.out.println("Enter the required sum:");
        int sum = Sc.nextInt();

        System.out.println("Pairs with given sum are:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}