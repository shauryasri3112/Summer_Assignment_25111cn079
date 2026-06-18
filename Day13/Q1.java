 import java.util.Scanner;
 import java.util.Arrays;
 public class Q1 {
    public static void main(String [] args) {
        int arr[] = new int[5];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the element of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = Sc.nextInt();
        }
    System.out.println("The elements of array are: " + Arrays.toString(arr));
    
    Sc.close();
       }
    }
    
