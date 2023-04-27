package month02.week04.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 给你一个整数数组 nums ，
* 判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
* 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
你返回所有和为 0 且不重复的三元组。
注意：答案中不可以包含重复的三元组。
*/
public class Day05_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int val = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            val = -nums[i];
            while (left < right) {
                if (val > nums[left] + nums[right]) {
                    left++;
                } else if (val < nums[left] + nums[right]) {
                    right--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    //去重
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = new Day05_15().threeSum(nums);
        System.out.println(lists);
    }
}
