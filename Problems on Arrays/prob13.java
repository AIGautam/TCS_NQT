// Adding Element in an Array


import java.util.*;

public class prob13 {

    public static List<Integer> insertAtBeginning(List<Integer> list, int element) {
        list.add(0, element);
        return list;
    }

    public static List<Integer> insertAtEnd(List<Integer> list, int element) {
        list.add(element);
        return list;
    }

    public static List<Integer> insertAtPosition(List<Integer> list, int element, int position) {
        list.add(position - 1, element);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        insertAtBeginning(arr, 6);
        insertAtPosition(arr, 8, 4);
        insertAtEnd(arr, 7);

        System.out.println("Final Array: " + arr);
    }
}
