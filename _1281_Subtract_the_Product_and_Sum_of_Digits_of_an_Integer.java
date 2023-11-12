public class _1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public int subtractProductAndSum(int n) {
        int a[] = new int[1000];
        int i = 0, temp = 0, count = 0;
        while (n != 0) {
            temp = n % 10;
            a[i] = temp;
            i++;
            count++;
            n /= 10;
        }

        int sum = 0, product = 1, result = 0;

        for (int j = 0; j < count; j++) {
            sum += a[j];
            product *= a[j];
        }

        result = product - sum;
        return result;

    }
}
