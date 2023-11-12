public class _217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        // sorting
        for(int i = 0; i < nums.length-1; i++) {
           for (int j = nums.length-1; j > 0+i; j--) {
                if (nums[i] == nums[j]) {
                    return true;
                }
           } 
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,1 };
        System.out.println("Result: " + containsDuplicate(nums));
    }
}
