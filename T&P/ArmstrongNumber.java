import java.util.Scanner;

public class ArmstrongNumber {

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        int count = 0, t = n;
        while (t > 0) {
            count++;
            t /= 10;
        }

        while (n > 0) {
            int rem = n % 10;
            sum += power(rem, count); 
            n /= 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        sc.close();
    }
}
