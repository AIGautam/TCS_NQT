// Maximum Subarray

public class prob21 {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];  
        int currMax = nums[0];   

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            currMax = Math.max(curr, currMax + curr);
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + result);  // Output: 6
    }
}
