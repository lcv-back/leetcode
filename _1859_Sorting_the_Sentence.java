public class _1859_Sorting_the_Sentence {
    public static String sortSentence(String s) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                temp++;
                if (Character.toString(c).equals(Integer.toString(c))) {
                    while (true) {
                        
                    }
                }
            }
        }
        return " ";
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String result = sortSentence(s);
        System.out.println("Result = " + result);
    }
}
