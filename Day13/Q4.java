import java.util.Scanner;
public class Q4 {
    public static void main(String [] args) {
        int arr[] = new int[5];
        Scanner Sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter the element of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = Sc.nextInt();
        } 
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}

