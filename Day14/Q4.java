import java.util.Scanner;
public class Q4 {
    public static void main(String [] args) {
        Scanner Sc = new Scanner(System.in);
        int arr[] = new int[5];
        int count=0;
        System.out.println("Enter the element of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Enter the Element whose frequency you want to find: ");
        int target = Sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("The frequency of " + target + " is: " + count);
    }

}
