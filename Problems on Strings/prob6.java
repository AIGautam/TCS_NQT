import java.util.Scanner;
// Remove characters from a string except alphabets


public class prob6 {
    public static String solve(String str, int n) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int ascii = (int) str.charAt(i);
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    System.out.print("Enter a string: ");
    String str = sc.nextLine(); 

    int n = str.length();

    System.out.println("Resultant string:");
    System.out.println(solve(str, n));

    sc.close(); 
    }
}