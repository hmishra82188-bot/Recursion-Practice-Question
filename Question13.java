import java.util.Scanner;

public class Main {
    static long power(long a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
}
