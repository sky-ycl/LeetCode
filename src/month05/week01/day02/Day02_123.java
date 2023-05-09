package month05.week01.day02;

public class Day02_123 {
    public int maxProfit(int[] prices) {
        /*
        dp[i][0]表示不操作最大金额
        dp[i][1]表示第一次持有股票最大金额
        dp[i][2]表示第一次不持有股票最大金额
        dp[i][3]表示第二次持有股票最大金额
        dp[i][4]表示第二次不持有股票最大金额
        */
        int n = prices.length;
        int[][] dp=new int[n][5];
        //初始化
        dp[0][0]=0;3
        return 0;
    }
}
