public class _2563_Count_the_Number_of_Fair_Pairs {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                int sum = nums[i] + nums[j];
                if (sum >= lower && sum <= upper) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 0,1,7,4,4,5};
        int lower = 3;
        int upper = 6;

        System.out.println(countFairPairs(nums, lower, upper));
    }
}
