import java.util.Scanner;

public class Main {
    static int toDecimal(String s, int i) {
        if (i == s.length()) {
            return 0;
        }
        return (s.charAt(i) - '0') * (int) Math.pow(2, s.length() - 1 - i)
                + toDecimal(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toDecimal(s, 0));
    }
}
