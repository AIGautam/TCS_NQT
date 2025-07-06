// Count number of vowels, consonants, spaces in String

import java.util.Scanner;

public class prob2 {

    static void countCharacters(String str){
        str = str.toLowerCase();
        int vowels = 0, consonants = 0, spaces = 0;
        for(int  i = 0; i<str.length(); i++){
            char ch  = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else if(ch >='a'  && ch <= 'z'){
                consonants++;
            }
            else if(ch == ' '){
                spaces++;
            }
        }
        System.out.println("vowels : " +vowels);
        System.out.println("consonants : " +consonants);
        System.out.println("spaces : " +spaces);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input =  sc.nextLine();
        countCharacters(input);
        sc.close();

    }
}
