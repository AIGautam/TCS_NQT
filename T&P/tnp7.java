import java.util.Scanner;

public class tnp7 {
    public static int Abundant(int n){
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum > n) {
            return 1; 
        } else if(sum < n){
            return 0; 
        } else {
            return 2; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Abundant(n);

        if(result == 1){
            System.out.println(n + " is an Abundant Number");
        } else if(result == 0){
            System.out.println(n + " is a Deficient Number");
        } else {
            System.out.println(n + " is a Perfect Number");
        }

        sc.close();
    }
}
