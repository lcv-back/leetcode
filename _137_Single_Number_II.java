import java.util.Arrays;;

public class _137_Single_Number_II {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 3) {
            // Limit is length-2 because if all case is failure
            // Then value of last element is only one
            // Because don't have next element equal with last element
            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                return nums[i];
            }
        }
        System.gc();
        return nums[nums.length - 1];
    }
}
