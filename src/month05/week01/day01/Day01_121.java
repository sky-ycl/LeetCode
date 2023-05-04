package month05.week01.day01;

/*
给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。

示例 1：
输入：[7,1,5,3,6,4]
输出：5
解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
示例 2：

输入：prices = [7,6,4,3,1]
输出：0
解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
*/
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
