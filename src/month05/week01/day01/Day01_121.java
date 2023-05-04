package month05.week01.day01;

public class Day01_121 {
    public int maxProfit(int[] prices) {
        //dp[i][0]表示持有股票的最大金额。dp[i][1]表示不持有股票的最大金额
        int n = prices.length;
        int[][] dp=new int[n][2];
        //初始化
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        for (int i = 1; i < n; i++) {
            //持有股票有两种可能，一是第i天才买入股票，二是第i-1天就买入了股票
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            //不持有股票有两种可能，一是第i天就才出了股票，二是i-1就卖出了股票
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[n-1][1];
    }

    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        int res = new Day01_121().maxProfit(prices);
        System.out.println(res);
    }
}
