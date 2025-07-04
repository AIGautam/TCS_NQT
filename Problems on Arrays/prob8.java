// Rotate array by K elements : Block Swap Algorithm

public class prob8 {

    public static void swap(int[] arr, int i, int j, int d) {
        for (int k = 0; k < d; k++) {
            int temp = arr[i + k];
            arr[i + k] = arr[j + k];
            arr[j + k] = temp;
        }
    }

    public static void leftRotate(int[] arr, int k, int n) {
        if (k == 0 || k == n) return;

        int i = k;
        int j = n - k;

        while (i != j) {
            if (i < j) {
                swap(arr, k - i, k + j - i, i);
                j -= i;
            } else {
                swap(arr, k - i, k, j);
                i -= j;
            }
        }

        swap(arr, k - i, k, i);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        int n = arr.length;

        leftRotate(arr, k, n);
        printArray(arr);
    }
}
