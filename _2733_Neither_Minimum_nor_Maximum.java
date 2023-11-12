public class _2733_Neither_Minimum_nor_Maximum {
    public int findNonMinOrMax(int[] nums) {
        long[] normalNumber = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };

        if (nums.length <= 2) {
            return -1;
        }
        for (int ai : nums) {
            insertionSort(normalNumber, ai);
        }
        return (int) normalNumber[1];
    }

    private void insertionSort(long[] normalNumber, int val) {
        int i = 0;
        while (i < normalNumber.length) {
            if (val > normalNumber[i]) {
                break;
            } else if (val < normalNumber[i]) {
                i++;
            } else {
                return;
            }
        }

        if (i < normalNumber.length) {
            for (int j = normalNumber.length - 2; j >= i; j--) {
                normalNumber[j + 1] = normalNumber[j];
            }
            normalNumber[i] = val;
        }
    }
}
