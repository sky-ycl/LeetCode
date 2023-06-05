package month05.week03.day03;

import java.util.Arrays;

public class Day03_674 {
    public int findLengthOfLCIS(int[] nums) {
        //dp[i]表示下标i的最长递增连续的子序列
        int[] dp=new int[nums.length];
        //初始化
        dp[0]=1;
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i]=Math.max(dp[i-1],i-index+1);
            }else{
                dp[i]=dp[i-1];
                index=i;
            }
        }
        //System.out.println(Arrays.toString(dp));
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,4,7};
        int res = new Day03_674().findLengthOfLCIS(nums);
        System.out.println(res);
    }
}
