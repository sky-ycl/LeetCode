package month08.week03.day04;

import java.util.Arrays;

public class Day04_322 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        // 初始化数组
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        // 遍历物品
        for (int i = 0; i < n; i++) {
            // 遍历背包
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j - coins[i]] + 1, dp[j]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int i = new Day04_322().coinChange(coins, 11);
        System.out.println(i);
    }
}

