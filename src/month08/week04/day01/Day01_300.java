package month08.week04.day01;

import java.util.Arrays;

public class Day01_300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==1) return 1;
        int n = nums.length;
        int[] dp = new int[n];
        int res = 0;
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            if (dp[i] > res) res = dp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 9, 2, 5, 3, 7, 101, 18};
        int i = new Day01_300().lengthOfLIS(nums);
        System.out.println(i);
    }
}
