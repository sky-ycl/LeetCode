package month05.week01.day01;

public class Day01_122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp=new int[n][2];
        //初始化
        dp[0][0]=prices[0];
        dp[0][1]=0;
        //dp[i][0]表示持有股票的最大金额
        //dp[i][1]表示不持有股票的最大金额
        for (int i = 1; i < n; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[n-1][1];
    }
}
