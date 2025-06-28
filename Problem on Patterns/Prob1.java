// package Problem on Patterns;

// Rectangular Star Pattern

public class Prob1 {
    static void pattern1(int n){
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=n; j++){
                System.out.print("*" +" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }
}
