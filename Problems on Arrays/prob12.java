import java.util.HashSet;

public class prob12 {

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num); 
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 2, 3, 4, 1, 5 };

        int[] uniqueArr = removeDuplicates(arr);

        System.out.print("Unique elements: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}
