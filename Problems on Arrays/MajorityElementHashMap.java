import java.util.HashMap;

public class MajorityElementHashMap {

    public static int findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
        System.out.println(findMajority(arr));
    }
}
