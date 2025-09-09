import java.util.Scanner;

public class tnp4 {
    public static int armstrong(int n){
        int sum = 0;
        int temp = n;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }
        if (sum == temp) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (armstrong(n) == 1) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        sc.close();
      
    }
}
