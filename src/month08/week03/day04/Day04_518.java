package month08.week03.day04;

public class Day04_518 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[] = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
