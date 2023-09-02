package month08.week03.day05;

import java.util.Arrays;

public class Day05_279 {
    public int numSquares(int n) {
        int num = 0;
        while (num * num <= n) {
            num++;
        }
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * i;
        }
        //System.out.println(Arrays.toString(nums));

        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        // 初始化
        for (int i = 1; i < nums.length; i++) {
            for (int j = nums[i]; j <= n; j++) {
                if (dp[j - nums[i]] != n) {
                    dp[j] = Math.min(dp[j], dp[j - nums[i]] + 1);
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int i = new Day05_279().numSquares(13);
        System.out.println(i);
    }
}
