public class Q2{
    public static void main(String[] args) {
        int number = 153; // Example number
        int result = armstrong(number);
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
    public static int armstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum;
    }
}
