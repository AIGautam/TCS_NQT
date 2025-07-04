// Find Median of the given Array



import java.util.*;
public class prob10 {

    public static double findmedian(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2 == 1){
            return arr[n/2];
        }
        else{
            return (arr[n/2 -1] + arr[n/2]) / 2.0;
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new  Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] =  sc.nextInt();
        } 
        double median = findmedian(arr);
        System.out.println(median);
        sc.close();
    }
}
