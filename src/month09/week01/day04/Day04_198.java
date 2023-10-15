package month09.week01.day04;

public class Day04_198 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int n = nums.length;
        int[] dp = new int[n];
        // 初始化
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] nums={1,3,1};
        int res = new Day04_198().rob(nums);
        System.out.println(res);
    }
}
