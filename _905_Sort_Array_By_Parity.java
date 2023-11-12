public class _905_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int iL = 0, iR = n - 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                result[iL] = nums[i];
                iL++;
            } else {
                result[iR] = nums[i];
                iR--;
            }

        }
        return result;
    }
}
