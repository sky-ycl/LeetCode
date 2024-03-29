package month07.week02.day01;

public class Day01_Offer63 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[][] dp=new int[n][2];
        // 初始化
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        for (int i = 1; i < n; i++) {
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[n-1][1];
    }
}
