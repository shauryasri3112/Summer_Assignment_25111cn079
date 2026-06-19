 import java.util.Scanner;
 public class Q1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        for (int i= n; i>0; i--){
            System.out.print(arr[i-1] + " ");
        }
    }
}