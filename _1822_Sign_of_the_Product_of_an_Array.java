public class _1822_Sign_of_the_Product_of_an_Array {
    public int arraySign(int[] nums) {
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                neg++;
            }
        }

        if (neg % 2 == 0) {
            return 1;
        }
        System.gc();
        return -1;
    }
}
