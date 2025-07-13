// Calculate Frequency of characters in a String



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prob11 {

    public static void printCharFrequency(String str) {
        str = str.toLowerCase(); // convert to lowercase

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        printCharFrequency(input);

        sc.close();
    }
}
