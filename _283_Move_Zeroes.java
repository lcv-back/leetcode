public class _283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int ind = 0;
        for (int i : nums) {
            if (i != 0)
                nums[ind++] = i;
        }

        while (ind != nums.length)
            nums[ind++] = 0;
    }
}
