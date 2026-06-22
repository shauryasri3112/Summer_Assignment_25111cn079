import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = Sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = Sc.nextInt();

        int low = 0;
        int high = n - 1;
        int found = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                found = 1;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }
    }
}