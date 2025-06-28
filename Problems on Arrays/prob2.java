// Find the Largest element in an array

public class prob2 {
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 1, 0};
        int result = findLargest(arr);
        System.out.println("Largest element: " + result);
    }
}

