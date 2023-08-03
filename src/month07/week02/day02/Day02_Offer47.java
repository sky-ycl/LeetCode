package month07.week02.day02;

public class Day02_Offer47 {
    public int maxValue(int[][] grid) {
        // dp[i][j] 表示到达i 位置得到的最大值
        // 递推公式dp[i][j]=Math.max(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j])
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        // 初始化
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) dp[0][i] = dp[0][i - 1] + grid[0][i];
        for (int i = 1; i < n; i++) dp[i][0] = dp[i - 1][0] + grid[i][0];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j] + grid[i][j], dp[i][j - 1] + grid[i][j]);
            }
        }
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        int i = new Day02_Offer47().maxValue(grid);
        System.out.println(i);
    }
}
