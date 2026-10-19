import java.util.Scanner;

public class Main {
    static int countOccurrences(String s, char c, int i) {
        if (i == s.length()) {
            return 0;
        }
        if (s.charAt(i) == c) {
            return 1 + countOccurrences(s, c, i + 1);
        }
        return countOccurrences(s, c, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(countOccurrences(s, c, 0));
    }
}
