public class _414_Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        for (int ai : nums) {
            insertionSort(maxArr, ai);
        }

        if (maxArr[2] != Long.MIN_VALUE)
            return (int) maxArr[2];
        return (int) maxArr[0];
    }

    private void insertionSort(long[] maxArr, int val) {
        int i = 0;
        while (i < maxArr.length) {
            if (val > maxArr[i]) {
                break;
            } else if (val < maxArr[i]) {
                i++;
            } else {
                // val == maxArr[i]
                return;
            }
        }

        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }
}
