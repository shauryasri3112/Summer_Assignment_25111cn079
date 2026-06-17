public class Q2{
    public static void main(String[] args) {
        int a =10;
        int b=20;
        int c = max(a,b);
        System.out.println("Maximum of two numbers is: "+c);
    }
    public static int max(int a, int b) {
        if(a>b) {
            return a;
        }
        else {
            return b;
        }
    }
}
