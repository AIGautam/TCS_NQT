import java.util.Scanner;

public class tnp {
    public static int spy(int n){
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n /= 10;
        }
        if (sum == prod) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(spy(n) == 1){
            System.out.println("Spy Number");
        }else{
            System.out.println("Not a Spy Number");
        }
        sc.close();
    }
}
