
import java.util.*;

public class Main {
    static int findMin(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        int min = findMin(arr, i + 1);

        if (arr[i] < min) {
            return arr[i];
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMin(arr, 0));
        sc.close();
    }
}
