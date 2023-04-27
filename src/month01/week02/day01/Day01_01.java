package month01.week02.day01;

import java.util.*;

/*给你一个整数数组 nums ，
判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
同时还满足 nums[i] + nums[j] + nums[k] == 0 。
*/
public class Day01_01 {
    //暴力解法
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new LinkedList<>();
        //将数组排序
        Arrays.sort(nums);
        //如果数组长度小于3,直接返回null
        if (nums == null || nums.length < 3) {
            return lists;
        }
        //定义左右指针
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            //判断结束条件
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    lists.add(list);
                    //判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,R 移到下一位置，寻找新的解
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else {
                    if (nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    }
                    if (nums[i] + nums[left] + nums[right] > 0) {
                        right--;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        // Set<List<Integer>> set = new Day01_01().threeSum(nums);
        //System.out.println(set);
        List<List<Integer>> lists = new Day01_01().threeSum(nums);
        System.out.println(lists);
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list.get(0) == list.get(1));
    }
}
