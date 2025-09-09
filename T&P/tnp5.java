import java.util.Scanner;

public class tnp5 {
    public static int XylemPhloem(int n){
        int digits = String.valueOf(n).length();
        int sum1 = 0, sum2 = 0;
        for (int i = digits; i >= 1; i--) {
            int rem = n % 10;
            if (i == digits || i == 1) {
                sum1 += rem;
            } else {
                sum2 += rem;
            }
            n /= 10;
        }
        if (sum1 == sum2) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(XylemPhloem(n) == 1){
            System.out.println("Xylem");
        }else{
            System.out.println("Phloem");
        }
        sc.close();
    }
}
