public class _1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double sum = 0;
        int count = 0;
        for (int i = 1; i < salary.length; i++) {
            if (max < salary[i]) {
                max = salary[i];
            }
        }

        for (int i = 1; i < salary.length; i++) {
            if (min > salary[i]) {
                min = salary[i];
            }
        }

        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            count++;
        }

        sum = sum - (max + min);

        sum = sum / (count - 2);
        return sum;
    }
}
