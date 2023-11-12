public class _709_To_Lower_Case {
    public String toLowerCase(String s) {
        int n = s.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }

            result += c;
        }
        return result;
    }
}
