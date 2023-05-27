package month05.week03.day01;

import java.util.Arrays;

/*
    最长递增子序列
*/
public class Day01_300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        //dp[i]表示已nums[i]结尾的最长递增子序列
        int[] dp=new int[n];
        //初始化
        Arrays.fill(dp,1);
        int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
                max=Math.max(max,dp[i]);
        }
        return max;
    }
}
