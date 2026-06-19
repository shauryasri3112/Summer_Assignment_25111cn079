import java.util.Scanner;
public class Q4{
    public static void main(String [] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] !=0) {
               int  temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
            System.out.println("the dublicate zero in end ");
            for (int i=0; i<n; i++){
               System.out.println(arr[i] + " ");
            }
        }
