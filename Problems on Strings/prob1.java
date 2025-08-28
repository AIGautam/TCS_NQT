

// Check if the given String is Palindrome or not

import java.util.Scanner;

public class prob1{
    static boolean isPalindrome(String str){
        str = str.toLowerCase().replaceAll("//s+", "");
        String reversed  = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str  = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT Palindrome");
        }
        sc.close();

    }
}

