// import java.util.*;
// Find the smallest element in an array
public class Prob1 {
    public static void main(String[] args){
        int arr[] = {2,3,4,1,9};
        // Arrays.sort(arr);
        int smallest = arr[0];
        for(int i = 0; i<arr.length; i++){
           if(arr[i] < smallest){
            smallest = arr[i];
           } 
        }
        System.out.println(smallest);
    }
}
