package month04.week01.day03;

public class Day03_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        //遍历物品
        for (String str : strs) {
            int x=0,y=0;
            for (char c : str.toCharArray()) {
                if (c=='0') x++;
                if (c=='1') y++;
            }
            //背包
            for (int i = m; i>=x; i--) {
                for (int j = n; j>=y; j--) {
                    dp[i][j]=Math.max(dp[i][j],dp[i-x][j-y]+1);
                }
            }
        }
        return dp[m][n];
    }
}
