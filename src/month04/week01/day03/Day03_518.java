package month04.week01.day03;

/*给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
假设每一种面额的硬币有无限个。
题目数据保证结果符合 32 位带符号整数。
*/
public class Day03_518 {
    public int change(int amount, int[] coins) {
        int[] dp=new int[amount+1];
        //初始化
        dp[0]=1;
        for (int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins={1,2,5};
        int count = new Day03_518().change(5, coins);
        System.out.println(count);

    }
}
