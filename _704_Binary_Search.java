public class _704_Binary_Search {
    public int search(int[] a, int key) {
        int n = a.length;
        return bSearch(a, key, 0, n - 1);
    }

    public static int bSearch(int a[], int key, int iLeft, int iRight) {
        int iMid = (iLeft + iRight) / 2;
        if (iLeft > iRight)
            return -1;

        if (a[iMid] == key)
            return iMid;
        else if (a[iMid] > key)
            return bSearch(a, key, iLeft, iMid - 1);

        return bSearch(a, key, iMid + 1, iRight);
    }
}
