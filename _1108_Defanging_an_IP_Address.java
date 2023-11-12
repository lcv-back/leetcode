public class _1108_Defanging_an_IP_Address {
    public static String defangIPaddr(String address) {
        int n = address.length(), count = 0;
        String result = "";
        for (int i = 0; i < n; i++) {
            char c = address.charAt(i);
            if (!(Character.isDigit(c))) { // Check c have is digit?
                for (int j = count; j <= i - 1; j++) {
                    result += address.charAt(j);
                }
                // Update count to count moved to current element
                count += 3 + (i - 1);
                result += "[.]";
            } else {
                result += c;
                count += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input1 = "1.1.1.1";
        String expected1 = "1[.]1[.]1[.]1";
        String output1 = defangIPaddr(input1);
        System.out.println(output1);
    }
}
