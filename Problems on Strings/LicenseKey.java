public class LicenseKey {
    public static String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder(s);
        int firstGroup = s.length() % k;
        StringBuilder result = new StringBuilder();
        int i = 0;
        if (firstGroup > 0) {
            result.append(sb.substring(0, firstGroup));
            i = firstGroup;
        }
        while (i < sb.length()) {
            if (result.length() > 0) result.append("-");
            result.append(sb.substring(i, i + k));
            i += k;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String S = "5F-3Z-2e-9-w";
        int K = 4;
        System.out.println(licenseKeyFormatting(S, K));
    }
}
