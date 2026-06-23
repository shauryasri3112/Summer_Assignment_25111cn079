import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] subtract = new int[3][3];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // subtracting matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                subtract[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(subtract[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

    

