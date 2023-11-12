public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (countNumbers(nums[i]) % 2 == 0)
                count++;
        }
        return count;
    }

    public int countNumbers(int a) {
        int count = 0;
        int b;
        while (a != 0) {
            b = a % 10;
            count++;
            a /= 10;
        }
        return count;
    }
}
