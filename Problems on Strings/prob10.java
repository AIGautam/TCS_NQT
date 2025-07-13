// Capitalize first and last character of each word of a string


import java.util.Scanner;

public class prob10 {
    public static String capitalizeWords(String str) {
    String[] words = str.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
        int len = word.length();

        if (len == 1) {
            result.append(Character.toUpperCase(word.charAt(0)));
        } else if (len > 1) {
            result.append(Character.toUpperCase(word.charAt(0)));
            result.append(word.substring(1, len - 1));
            result.append(Character.toUpperCase(word.charAt(len - 1)));
        }

        result.append(" ");
    }

    return result.toString().trim();
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = "hello world";
        String result = capitalizeWords(str);
        System.out.println(result);
        sc.close();
    }
}
