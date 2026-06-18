import java.util.Scanner;
public class Q1 {
    public static void main(String [] args) {
        int arr[] = new int[5];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the element of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = Sc.nextInt();
        }

    System.out.println("Enter the target element to search: ");
    int target = Sc.nextInt();

for (int i = 0; i < 5; i++) {
    if (arr[i] == target) {
        System.out.println("Element found at index: " + i);
        return;
    }

System.out.println("Element not found in the array.");
}
Sc.close();
}
}


