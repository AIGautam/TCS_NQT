// find the intersection of two arrays

import java.util.HashSet;

public class prob19 {
    public static void findIntersection(int arr1[], int arr2[]){
        HashSet<Integer> set =  new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for(int num : arr2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        System.out.println("Intersection of the two arrays:");
        for(int num : intersection){
            System.out.print(num +" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};
        findIntersection(arr1, arr2);
    }
}
