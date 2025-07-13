// Check if two Strings are anagrams of each other


import java.util.HashMap;

public class prob13 {
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!freq.containsKey(c)) return false;
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) freq.remove(c);
        }

        return freq.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty room";

        System.out.println(areAnagrams(s1, s2));  // true
    }
}
