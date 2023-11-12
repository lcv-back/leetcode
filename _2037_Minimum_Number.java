
import java.util.Arrays;

public class _2037_Minimum_Number {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            int temp = seats[i] - students[i];
            if (temp < 0) {
                temp = students[i] - seats[i];
            }

            sum += temp;
        }
        System.gc();
        return sum;
    }

    public static void main(String[] args) {
        int[] seats = { 3, 1, 5 };
        int[] students = { 2, 7, 4 };
        int result = minMovesToSeat(seats, students);
        System.out.println("Result = " + result);
    }
}