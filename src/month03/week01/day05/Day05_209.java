package month03.week01.day05;

import java.util.Arrays;

/*给定一个含有n个正整数的数组和一个正整数 target 。
找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，
并返回其长度。如果不存在符合条件的子数组，返回 0 。
*/
public class Day05_209 {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0, edd = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        while (edd < nums.length) {
            sum += nums[edd];
            while (sum >= target) {
                minLen = Math.min(minLen, edd - start + 1);
                sum-=nums[start];
                start++;
            }
            edd++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int res = new Day05_209().minSubArrayLen(7, nums);
        System.out.println(res);
    }
}
