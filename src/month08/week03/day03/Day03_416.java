package month08.week03.day03;


public class Day03_416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n < 2) return false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        int[] dp = new int[target+1];
        // 初始化
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        if (dp[target] == target) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean res = new Day03_416().canPartition(nums);
        System.out.println(res);
    }
}
