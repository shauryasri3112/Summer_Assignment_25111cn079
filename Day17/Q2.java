
import java.util.Scanner;

public class Q2 {
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

        int union[] = new int[n1 + n2];
        int k = 0;

        // Add all elements of first array
        for (int i = 0; i < n1; i++) {
            union[k++] = arr1[i];
        }

        // Add only non-duplicate elements from second array
        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr2[i] == union[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = arr2[i];
            }
        }

        System.out.println("Union of arrays:");

        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}


