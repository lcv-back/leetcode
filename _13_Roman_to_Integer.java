public class _13_Roman_to_Integer {
    public int romanToInt(String s) {
        int n = s.length();
        int result = 0; // => sum
        int i = 0;
        while (i < n) {
            char cI = s.charAt(i);
            boolean isValid = (i < n - 1) ? true : false;
            if (cI == 'I') {
                if (isValid && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i += 2;
                } else if (isValid && s.charAt(i + 1) == 'X') {
                    result += 9;
                    i += 2;
                } else {
                    result += 1;
                    i++;
                }
            }

            else if (cI == 'V') {
                result += 5;
                i++;
            }

            else if (cI == 'X') {
                if (isValid && s.charAt(i + 1) == 'L') {
                    result += 40;
                    i += 2;
                } else if (isValid && s.charAt(i + 1) == 'C') {
                    result += 90;
                    i += 2;
                } else {
                    result += 10;
                    i++;
                }
            }

            else if (cI == 'L') {
                result += 50;
                i++;
            }

            else if (cI == 'C') {
                if (isValid && s.charAt(i + 1) == 'D') {
                    result += 400;
                    i += 2;
                } else if (isValid && s.charAt(i + 1) == 'M') {
                    result += 900;
                    i += 2;
                } else {
                    result += 100;
                    i++;
                }
            }

            else if (cI == 'D') {
                result += 500;
                i++;
            }

            else if (cI == 'M') {
                result += 1000;
                i++;
            }
        }

        return result;
    }
}
