public class Q4{
    public static void main(String[] args) {
        perfectnumber();
    }
    public static int perfectnumber() {
        int n = 28;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
        return sum;
    }
}