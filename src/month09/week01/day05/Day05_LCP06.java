package month09.week01.day05;

public class Day05_LCP06 {
    public int minCount(int[] coins) {
        int count = 0;
        for (int coin : coins) {
            if (coin % 2 == 0) count += coin / 2;
            else if (coin != 1 && coin % 2 != 0) count += coin / 2 + 1;
            else count++;
        }
        return count;
    }
}
