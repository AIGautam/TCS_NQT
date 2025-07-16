// Find all repeating elements in an array


import java.util.HashMap;
import java.util.Map;

public class prob14 {

    public static void findRepeating(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.print("Repeating elements: ");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        findRepeating(arr);
    }
}
