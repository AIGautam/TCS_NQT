import java.util.Scanner;

public class tnpc {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        x = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
                    : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

        x = (x == a) ? ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d)) :
            (x == b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) :
            (x == c) ? ((a > b) ? ((a > d) ? a : d) : ((b > d) ? b : d)) :
                       ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));

        System.out.println(x); 
        sc.close();
    }
}
