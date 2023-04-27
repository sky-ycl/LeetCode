package month04.week01.day01;

public class Day01_494_1 {
    private int count = 0;
    //暴力 回溯
    public int findTargetSumWays(int[] nums, int target) {
        backTrack(0,nums,0,target);
        return count;
    }

    public void backTrack(int start, int[] nums, int sum, int target) {
        if (start == nums.length) {
            if (sum == target) {
                count++;
            }
            return;
        }
        backTrack(start + 1, nums, sum+nums[start],target);
        backTrack(start + 1, nums, sum-nums[start],target);
    }
}
