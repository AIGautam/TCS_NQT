// Find the Largest & smallest element in an array

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
    public static int findSmallest(int[] arr){
        int smallest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 1, 0};
        int result = findLargest(arr);
        int result_1 = findSmallest(arr);
        System.out.println("Largest element: " + result);
        System.out.println("Smallest element: " +result_1);
    }
}

