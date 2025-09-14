// Move All # (Hash) Characters to the Front of the String

public class removeHashtag {
    public static String moveHashtagfirst(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder hashes = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                hashes.append('#'); 
            } else {
                letters.append(ch);
            }
        }

        return hashes.append(letters).toString();
    }

    public static void main(String[] args) {
        String s = "#Gatam#Kumar";
        System.out.println(moveHashtagfirst(s));
    }
}
