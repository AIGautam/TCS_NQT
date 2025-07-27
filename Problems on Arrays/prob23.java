// Maximum Product Subarray in an Array

public class prob23 {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, -3, 0, -4, -5 };
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}
