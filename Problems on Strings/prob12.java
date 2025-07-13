// Find Non-repeating characters of a String



// import java.util.LinkedHashMap;
import java.util.*;

public class prob12 {

    public static void printNonRepeatingChars(String str) {
        str = str.toLowerCase(); 

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.print("Non-repeating characters: ");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        printNonRepeatingChars(input);

        sc.close();
    }
}
