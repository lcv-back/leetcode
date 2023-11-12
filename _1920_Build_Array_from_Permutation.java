import java.util.Arrays;

class _1920_Build_Array_from_Permutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        System.gc();
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}