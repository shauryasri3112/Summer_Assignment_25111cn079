import java.util.Scanner;
public class Q2 {
    public static void main(String [] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        } 
        int temp =arr[0];
        for (int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println("The elements of the array after left rotation are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}