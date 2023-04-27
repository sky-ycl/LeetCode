package month04.week04.day02;

import java.util.Arrays;

public class Day02_213 {
    public int rob(int[] nums) {
        if(nums.length<3){
            return nums.length==1?nums[0]:Math.max(nums[0],nums[1]);
        }
        return Math.max(getMax(nums,0,nums.length-2),getMax(nums,1,nums.length-1));
    }

    public int getMax(int[] nums,int n,int m){
        int[] dp=new int[nums.length];
        //初始化
        dp[n]=nums[n];
        dp[n+1]=Math.max(nums[n],nums[n+1]);
        for (int i = n+2; i <= m; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[m];
    }
}
