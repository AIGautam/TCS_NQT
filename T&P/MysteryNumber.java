import java.util.Scanner;

public class MysteryNumber{
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
    public static boolean isMystery(int n) {
        for (int i = 1; i <= n / 2; i++) {
            int rev = reverse(i);
            int sum = i + rev;
            if (sum == n) {
                System.out.println("Match found: " + i + " + " + rev + " = " + n);
                return true;
            } else if (sum > n) {
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isMystery(n)) {
            System.out.println(n + " is a Mystery Number.");
        } else {
            System.out.println(n + " is not a Mystery Number.");
        }

        sc.close();
    }
}
