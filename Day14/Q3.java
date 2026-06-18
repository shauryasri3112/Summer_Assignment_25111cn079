import java.util.Scanner;
public class Q3 {
    public static void main(String [] args) {
        int arr[] = new int[5];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the element of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = Sc.nextInt();
        }
    int secondLargest = Integer.MIN_VALUE;
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }
    System.out.println("The second largest element is: " + secondLargest);
}
Sc.close();
}