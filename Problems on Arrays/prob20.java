import java.util.*;

public class prob20 {
    public static void findSubarraysWithSum(int[] arr, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(Arrays.asList(-1)));  // prefix sum 0 at index -1
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - target)) {
                for (int start : map.get(sum - target)) {
                    System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(arr, start + 1, i + 1)));
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;
        findSubarraysWithSum(arr, target);
    }
}
