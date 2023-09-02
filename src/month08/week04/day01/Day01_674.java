package month08.week04.day01;

import java.util.Arrays;

public class Day01_674 {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for (int i = 1; i < n; i++) {
            if(nums[i]>nums[i-1]) {
                dp[i]=dp[i-1]+1;
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
