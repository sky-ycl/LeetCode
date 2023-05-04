package month05.week01.day01;

/*
买卖股票的最佳时机  方法2
*/
public class Day01_121_1 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //dp[i]表示前i天的最低股票
        int[] dp=new int[n];
        //初始化
        dp[0]=prices[0];
        //表示最大利润
        int max=0;
        for (int i = 1; i < n; i++) {
            dp[i]=Math.min(dp[i-1],prices[i]);
            max=Math.max(prices[i]-dp[i],max);
        }
        return max;
    }
}
