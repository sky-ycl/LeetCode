package month08.week02.day01;

public class Day01_Offer42 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // dp[i]表示以i结尾的最大连续子数组和
        int[] dp = new int[n];
        // 初始化
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] >= 0 ? dp[i - 1] + nums[i] : nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        int res = new Day01_Offer42().maxSubArray(nums);
        System.out.println(res);
    }
}
