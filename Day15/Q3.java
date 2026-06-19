import java.util.Scanner;
public class Q3 {
    public static void main(String [] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int temp = arr[n-1];
         for (int i=n-1;i>0;i--){
        
            arr[i] =arr[i-1];
         }
            arr[0] = temp;
        System.out.println("The elements of the array after right rotation are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}