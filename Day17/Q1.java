import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = Sc.nextInt();

        int arr1[] = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = Sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = Sc.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = Sc.nextInt();
        }

        int merged[] = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}