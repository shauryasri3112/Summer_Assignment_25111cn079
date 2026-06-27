import java.util.Scanner;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        // Remove spaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not Anagrams.");
        } else {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println("Strings are Anagrams.");
            } else {
                System.out.println("Strings are not Anagrams.");
            }
        }

        sc.close();
    }
}