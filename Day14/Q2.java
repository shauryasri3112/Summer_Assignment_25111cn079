import java.util.Scanner;
public class Q2 {
    public static void main(String [] args) {
        int arr[] = new int[10];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the element of array");
        for (int i = 0; i < 10; i++) {
            arr[i] = Sc.nextInt();
        }
    int count = 0;
    for (int i = 0; i < 10; i++) {
      if(arr[i] ==arr[i+1]){
        count++;
      }
    }
    System.out.println("The number of elements that are repeated in the array is: " + count);
}
Sc.close();
}
