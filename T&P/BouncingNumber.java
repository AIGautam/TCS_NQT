import java.util.Scanner;

public class BouncingNumber {

    public static boolean isBouncing(int n) {
        int prevDigit = n % 10;
        n /= 10;

        boolean increasing = false;
        boolean decreasing = false;

        while (n > 0) {
            int currDigit = n % 10;

            if (currDigit < prevDigit) {
                increasing = true;
            } else if (currDigit > prevDigit) {
                decreasing = true;
            }

            prevDigit = currDigit;
            n /= 10;
        }

        return increasing && decreasing; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isBouncing(n)) {
            System.out.println(n + " is a Bouncing Number.");
        } else {
            System.out.println(n + " is not a Bouncing Number.");
        }

        sc.close();
    }
}
