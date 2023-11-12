import java.util.ArrayList;
import java.util.List;

public class _2824_Count_Pairs_Whose_Sum_is_Less_than_Target {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums.get(i) + nums.get(j);
                if (sum < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        // -6,2,5,-2,-7,-1,3
        nums.add(-6);
        nums.add(2);
        nums.add(5);
        nums.add(-2);
        nums.add(-7);
        nums.add(-1);
        nums.add(3);

        int result = countPairs(nums, -2);
        System.out.println(result);
    }
}
