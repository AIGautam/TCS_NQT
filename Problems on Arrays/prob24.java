// Replace elements by its rank in the array

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class prob24 {
    public static int[] replaceWithRanks(int arr[]) {
        int temp[] = arr.clone();
        // int n = arr.length;
        Arrays.sort(temp);
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : temp) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 20,15,26,2,98,6 };
        int[] result = replaceWithRanks(arr);
        System.out.println("Array after rank replacement: " + Arrays.toString(result));
    }
}
