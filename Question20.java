import java.util.Scanner;

public class Main {
    static String removeChar(String s, char c, int i) {
        if (i == s.length()) {
            return "";
        }
        if (s.charAt(i) == c) {
            return removeChar(s, c, i + 1);
        }
        return s.charAt(i) + removeChar(s, c, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(removeChar(s, c, 0));
    }
}
