// Find Second Smallest and Second Largest Element in an array

import java.util.*;
public class prob3 {

    static private int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    static private int secondLargest(int[] arr, int n) {
        if (n < 2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        // int[] arr = { 1, 2, 4, 7, 7, 5 };
        // int n = arr.length;
        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);
        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
        sc.close();
    }
}
