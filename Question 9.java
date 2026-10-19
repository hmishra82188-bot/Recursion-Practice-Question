import java.util.Scanner;

public class Main {
    static long reverse(long n, long rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(reverse(n, 0));
    }
}
