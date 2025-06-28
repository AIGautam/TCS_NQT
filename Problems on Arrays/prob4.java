// Reverse a given Array

// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
import java.util.*;

public class prob4 {
    public static void main(String[] args) {
        // int arr[] = {3,2,4,1,5};
        // for(int i = arr.length-1; i>=0; i--){
        //     System.out.print(arr[i]);
        // }
        List<Integer> arr = Arrays.asList(3, 2, 4, 1, 5);
        Collections.reverse(arr);
        System.out.println(arr);
      
    }
}
