package month03.week04.day06;

public class Day06_96 {
    public int numTrees(int n) {
        if (n < 3) {
            return n;
        }
        int[] dp=new int[n+1];
        //初始化
        dp[0]=dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int res = new Day06_96().numTrees(4);
        System.out.println(res);

    }
}
