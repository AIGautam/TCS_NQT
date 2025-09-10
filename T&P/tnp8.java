import java.util.Scanner;

public class tnp8 {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int smithNumber(int n) {
        int sumDigits = sumOfDigits(n);
        int sumPrimeFactors = 0;
        int originalN = n;
        int temp = n;

        while (temp % 2 == 0) {
            sumPrimeFactors += sumOfDigits(2);
            temp /= 2;
        }
        for (int i = 3; i <= Math.sqrt(temp); i += 2) {
            while (temp % i == 0) {
                sumPrimeFactors += sumOfDigits(i);
                temp /= i;
            }
        }
        if (temp > 2) {
            sumPrimeFactors += sumOfDigits(temp);
        }
        if (sumDigits == sumPrimeFactors && originalN != temp) {
            return originalN;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = smithNumber(n);
        if (result != -1) {
            System.out.println(result + " is a Smith Number.");
        } else {
            System.out.println(n + " is not a Smith Number.");
        }
        sc.close();
    }
}