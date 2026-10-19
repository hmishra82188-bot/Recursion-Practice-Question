import java.util.Scanner;

public class Main {
    static void toBinary(int n) {
        if (n == 0) {
            return;
        }
        toBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print(0);
        } else {
            toBinary(n);
        }
    }
}
