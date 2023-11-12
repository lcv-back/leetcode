import java.util.Arrays;

public class _1464_Maximum_Product_of_Two_Elements {
    public static int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > temp) {
                temp = nums[i];
            }
        }
        max1 = temp;
        temp = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max1) {
                count++; // check if value of max1 equal than 1 then return
                nums[i] = 0;
                if (count > 1) {
                    return (max1 - 1) * (max1 - 1);
                }
            } else if (nums[i] > temp) { // find value 2'th else that case
                temp = nums[i];
            }
        }

        max2 = temp;
        System.gc();
        return (max1 - 1) * (max2 - 1);
    }

    public static void main(String[] args) {
        int[] nums = {3,7};
        int result = maxProduct(nums);
        System.out.println(result);
    }
}
