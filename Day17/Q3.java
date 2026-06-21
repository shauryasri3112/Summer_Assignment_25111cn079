import java.util.Scanner;

public class Q3 {
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

        System.out.println("Intersection of arrays:");

        for (int i = 0; i < n1; i++) {
            boolean found = false;

            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
