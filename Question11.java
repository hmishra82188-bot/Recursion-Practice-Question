import java.util.Scanner;

public class Main {
    static int productDigits(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 10) {
            return n;
        }
        return (n % 10) * productDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(productDigits(n));
    }
}
