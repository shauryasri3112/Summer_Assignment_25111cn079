import java.util.Scanner;
import java.util.Arrays;
public class Q2 {
    public static void main(String [] args) {
        int arr[] = new int[5];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the element of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = Sc.nextInt();
        }
    int n = 0;
    for (int i = 0; i < 5; i++) {
        n += arr[i];
    }
    System.out.println("The sum of array elements is: " + n);
}
Sc.close();
}

