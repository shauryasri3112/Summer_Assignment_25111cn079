import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] merge = new int[n1 + n2];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merge[k] = arr1[i];
                i++;
            } else {
                merge[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            merge[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            merge[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged Sorted Array:");
        for (i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }

        sc.close();
    }
}