// Find all the non-repeating elements in an array


import java.util.HashMap;
import java.util.Map;

public class prob15 {

    public static void findNonRepeating(int[] arr) {
        // arr = [4, 2, 4, 5, 2, 3, 1]

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // freqMap = {} (initially empty)

        // Step 1: Count frequency of each element
        for (int num : arr) {
            // getOrDefault(num, 0) returns value if present else 0
            // then add 1 to count frequency
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            // Dry run:
            // num = 4 → getOrDefault(4, 0) = 0 → put(4,1)
            // num = 2 → getOrDefault(2, 0) = 0 → put(2,1)
            // num = 4 → getOrDefault(4, 1) = 1 → put(4,2)
            // num = 5 → getOrDefault(5, 0) = 0 → put(5,1)
            // num = 2 → getOrDefault(2, 1) = 1 → put(2,2)
            // num = 3 → getOrDefault(3, 0) = 0 → put(3,1)
            // num = 1 → getOrDefault(1, 0) = 0 → put(1,1)

            // freqMap after loop = {1=1, 2=2, 3=1, 4=2, 5=1}
        }

        // Step 2: Print elements whose frequency == 1
        System.out.print("Non-repeating elements: ");

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();     // element
            int value = entry.getValue(); // frequency

            // print only those elements which occur exactly once
            if (value == 1) {
                System.out.print(key + " ");
            }

            // Dry run:
            // 4 → freq = 2 → skip
            // 2 → freq = 2 → skip
            // 5 → freq = 1 → print 5
            // 3 → freq = 1 → print 3
            // 1 → freq = 1 → print 1
        }

        // Output: Non-repeating elements: 5 3 1
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        findNonRepeating(arr);
    }
}
