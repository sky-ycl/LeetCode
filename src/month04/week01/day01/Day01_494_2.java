package month04.week01.day01;

public class Day01_494_2 {
    //动态规划
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int bagSize = (sum + target) / 2;
        if (sum < target || (sum + target) % 2 != 0 || bagSize<0) {
            return 0;
        }
        int[] dp=new int[bagSize+1];
        //初始化
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            for(int j=bagSize;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[bagSize];
    }

    public static void main(String[] args) {
        int[] nums={100};
        int res = new Day01_494_2().findTargetSumWays(nums,-200);
    }
}
