import java.util.Arrays;
// Chocolate Distribution Problem

public class prob22 {

    public static int findMinDifference(int[] arr, int m) {
        int n = arr.length;

        if (n == 0 || m == 0 || m > n)
            return -1;

        Arrays.sort(arr); 

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i]; 
            if (diff < minDiff) {
                minDiff = diff; 
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3; 

        int result = findMinDifference(arr, m);
        System.out.println("Minimum difference is: " + result);
    }
}
