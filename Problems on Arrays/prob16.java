// Find all Symmetric Pairs in the array of pairs


import java.util.HashMap;

public class prob16 {

    public static void findSymmetricPairs(int[][] pairs) {
        // Sample input: pairs = { {1, 2}, {3, 4}, {2, 1}, {5, 6}, {4, 3} }

        HashMap<Integer, Integer> map = new HashMap<>();
        // map = {} initially

        System.out.println("Symmetric pairs are:");

        for (int i = 0; i < pairs.length; i++) {
            int first = pairs[i][0];
            int second = pairs[i][1];

            // Check if reverse pair (second, first) already exists in map
            if (map.containsKey(second) && map.get(second) == first) {
                // if reverse exists → it's a symmetric pair
                System.out.println("(" + first + ", " + second + ")");
            } else {
                // else store this pair for future check
                map.put(first, second);
            }

            // Dry Run:
            // Iteration 1: (1,2) → map = {1=2}
            // Iteration 2: (3,4) → map = {1=2, 3=4}
            // Iteration 3: (2,1) → check if 1 in map and map.get(1)==2 → true → print (2,1)
            // Iteration 4: (5,6) → map = {1=2, 3=4, 5=6}
            // Iteration 5: (4,3) → check if 3 in map and map.get(3)==4 → true → print (4,3)
        }

        // Output:
        // Symmetric pairs are:
        // (2, 1)
        // (4, 3)
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {1, 2},
            {3, 4},
            {2, 1},
            {5, 6},
            {4, 3}
        };

        findSymmetricPairs(pairs);
    }
}
