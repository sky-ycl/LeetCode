package month02.week03.day05;

import month02.week03.day04.Day04_1221;

/*给你一个整数数组 nums （下标从 0 开始）。每一次操作中，你可以选择数组中一个元素，并将它增加 1 。
比方说，如果 nums = [1,2,3] ，你可以选择增加 nums[1] 得到 nums = [1,3,3] 。
请你返回使 nums 严格递增 的 最少 操作次数。
我们称数组 nums 是 严格递增的 ，
当它满足对于所有的 0 <= i < nums.length - 1 都有 nums[i] < nums[i+1] 。
一个长度为 1 的数组是严格递增的一种特殊情况。
*/
public class Day05_1827 {
    public int minOperations(int[] nums) {
        //统计次数
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int pre = nums[i-1];
            if (nums[i] <= nums[i - 1]) {
                count += pre - nums[i] + 1;
                nums[i] = pre + 1;
            } else {
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 1};
        int i = new Day05_1827().minOperations(nums);
        System.out.println(i);
    }
}
