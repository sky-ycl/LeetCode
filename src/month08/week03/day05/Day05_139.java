package month08.week03.day05;

import java.util.List;

public class Day05_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        // 初始化
        dp[0] = true;
        // i表示长度
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // 递推公式
                if (dp[j] == true && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String s = "hello";
        String s1 = s.substring(1, 3);
        System.out.println(s1);
    }
}
