package month03.week01.day04;

/*
给定一个含有n个正整数的数组和一个正整数 target 。
找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，
并返回其长度。如果不存在符合条件的子数组，返回 0 。
*/
public class Day04_209 {
    public int minSubArrayLen(int target, int[] nums) {
        //暴力解法
        int minLen=nums.length+1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                int len=j-i+1;
                if (sum>=target) {
                    //找到最小长度的子数组
                    minLen=Math.min(minLen,len);
                }
            }
        }
        return minLen==nums.length+1?0:minLen;
    }
}
