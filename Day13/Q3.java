import java.util.Scanner;
import java.util.Arrays;
public class Q3 {
    public static void main(String [] args) {
        int arr[] = new int[5];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the element of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = Sc.nextInt();
        }
        int largest = arr[0];
        int secondLargest = arr[0];
    for (int i = 1; i < arr.length-1; i++) {
        if (arr[i] > largest ) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }
    System.out.println("The largest element is: " + largest);
    System.out.println("The second largest element is: " + secondLargest);
}
Sc.close();
}