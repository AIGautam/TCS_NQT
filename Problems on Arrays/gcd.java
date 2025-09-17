// 💡 Given an array of integers, find and print all pairs of elements that are coprime (i.e., their GCD is 1).

public class gcd {
    static int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a =temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,9};
        int n = arr.length;
        for(int i  =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(GCD(arr[i], arr[j]) == 1){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
