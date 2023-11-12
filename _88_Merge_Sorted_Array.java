public class _88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            insertIntoArray(ai, nums1, m);
            m++;
        }
        System.gc();
    }

    private void insertIntoArray(int x, int[] a, int m) {
        boolean isFlag = false;
        for (int i = 0; i < m; i++) { // a is nums1
            if (x < a[i]) { // find first element x less than
                isFlag = true; // find out
                for (int j = m - 1; j >= i; j--) {
                    a[j + 1] = a[j];
                }
                a[i] = x;
                break;
            }
        }
        if (isFlag == false) { // find not found
            a[m] = x;
        }
    }
}
