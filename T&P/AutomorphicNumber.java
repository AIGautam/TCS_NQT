import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long square = n * n;
        String numStr = Long.toString(n);
        String squareStr = Long.toString(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is not an Automorphic Number.");
        }

        sc.close();
    }
}
