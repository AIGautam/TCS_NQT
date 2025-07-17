// Find all elements in the array that appear more than ⌊n/3⌋ times.
import java.util.*;

public class prob17 {
    public static void findMajorityNby3(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print elements whose count > n/3
        System.out.print("Elements appearing more than n/3 times: ");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > n / 3) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 3, 3};
        findMajorityNby3(arr);
    }
}
