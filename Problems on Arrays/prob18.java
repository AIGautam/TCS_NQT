// find the union of two arrays 

import java.util.HashSet;

public class prob18 {
    public static void findUnion(int arr1[], int arr2[]){
        HashSet<Integer> unionSet  = new HashSet<>();
        for(int num : arr1){
            unionSet.add(num);
        }
        for(int num : arr2){
            unionSet.add(num);
        }
        System.out.println("Union of the two arrays:");
        for(int num : unionSet){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};
        findUnion(arr1, arr2);
    }
}
