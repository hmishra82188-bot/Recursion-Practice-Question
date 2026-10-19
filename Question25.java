
import java.util.*;

public class Main {
    static int linearSearch(int[] arr, int x, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == x) {
            return i;
        }

        return linearSearch(arr, x, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(linearSearch(arr, x, 0));
        sc.close();
    }
}
