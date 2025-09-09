import java.util.*;
public class tnp3 {
    public static int StrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
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
        int n =  sc.nextInt();
        if (StrongNumber(n) == 1) {
            System.out.println(n + " is a Strong number.");
        } else {
            System.out.println(n + " is not a Strong number.");
        }
        sc.close();
    }
}
