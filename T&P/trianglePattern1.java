public class trianglePattern1 {
    public static void trianglePattern(int n){
        for(int i = 0; i<n; i++){
            for(int j =0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void trianglePatternReverse(int n){
        for(int i = n; i>0; i--){
            for(int j =0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starPyramid(int n){
        for(int i = 0; i<n; i++){
            for(int j =0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k =0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        trianglePattern(n);
        System.out.println();
        trianglePatternReverse(n);
        System.out.println();
        starPyramid(n);
    }
}
