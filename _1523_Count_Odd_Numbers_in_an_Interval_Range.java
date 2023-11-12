public class _1523_Count_Odd_Numbers_in_an_Interval_Range {
    public int countOdds(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0)
            return (high - low) / 2;
        return (high - low) / 2 + 1;
    }
}
