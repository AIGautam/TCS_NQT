import java.util.Scanner;
// reverse String

public class prob7 {
    public static String reverseString(String str){
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        str = str1.toString();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        System.out.println(reverseString(str));

        sc.close();
    }
}
