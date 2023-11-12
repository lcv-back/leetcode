public class _66_Plus_One {
    public int[] plusOne(int[] a) {
        int l = a.length;

        if (a[l - 1] != 9) {
            a[l - 1] += 1;
        } else { // a[l-1] = 9
            int count = 0;
            for (int i = 0; i < l; i++) {
                if (a[i] == 9)
                    count++;
            }

            if (count != l) {
                for (int i = l - 1; i >= 0; i--) {
                    if (a[i] != 9) {
                        a[i] += 1;
                        for (int j = i + 1; j < l; j++) {
                            a[j] = 0;
                        }
                        break;
                    }
                }
            } else { // All elements of array equal 9
                int[] b = new int[l + 1];
                int new_l = l + 1;
                b[0] = 1;
                for (int i = 1; i < new_l; i++) {
                    b[i] = 0;
                }

                return b;
            }
        }
        System.gc();
        return a;
    }
}
