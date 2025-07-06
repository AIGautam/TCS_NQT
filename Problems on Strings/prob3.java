// Find the ASCII value of a character

import java.util.Scanner;

public class prob3 {
    static void  getAscii(char ch){
        int ascii =  ch;
        System.out.println(ascii);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        char ch = sc.next().charAt(0); 
        getAscii(ch);
        sc.close();

    } 
}
