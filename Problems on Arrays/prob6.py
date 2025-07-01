# Rearrange array in increasing-decreasing order
# Example 1:
# Input: 8 7 1 6 5 9
# Output: 1 5 6 9 8 7

def rearrange_inc_dec(arr):
    arr.sort()
    n = len(arr)
    mid = n//2
    result = arr[:mid] + arr[mid:][::-1]
    return result
arr = [2,3,1,4,9,6]
print(rearrange_inc_dec(arr))




# import java.util.Arrays;
# public class Main {

#   public static void main(String args[]) {

#     int arr[] = {8,7,1,6,5,9};
#     int n = arr.length;
#     Arrays.sort(arr);
#     for (int i = 0; i < n / 2; i++) {
#       System.out.print(arr[i] + " ");
#     }
#     for (int i = n - 1; i >= n / 2; i--) {
#       System.out.print(arr[i] + " ");
#     }
# }
# }