package month02.week01.day04;

import java.util.ArrayList;
import java.util.List;

/*给你一个整数数组 nums ，找出并返回所有该数组中不同的递增子序列，递增子序列中 至少有两个元素 。
你可以按 任意顺序 返回答案。
数组中可能含有重复元素，如出现两个整数相等，也可以视作递增序列的一种特殊情况。
*/
public class Day04_491 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backTrack(0, nums);
        return lists;
    }

    public void backTrack(int start, int[] nums) {
        if (list.size() >= 2) {
            lists.add(new ArrayList<>(list));
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((i == 0 && nums[i] <= nums[i + 1]) || i != 0 && nums[i] >= nums[i - 1]) {
                list.add(nums[i]);
                backTrack(i + 1, nums);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1};
        List<List<Integer>> lists = new Day04_491().findSubsequences(nums);
        System.out.println(lists);
    }
}
//[[1,2],[1,2,,3,4,5],[1,2,3,4,5,6],[1,2,3,4,5,6,7],[1,2,3,4,5,6,7,8],[1,2,3,4,5,6,7,8,9],[1,2,3,4,5,6,7,8,9,10],[1,2,3,4,5,6,7,8,10],[1,2,3,4,5,6,7,9],[1,2,3,4,5,6,7,9,10],[1,2,3,4,5,6,7,10],[1,2,3,4,5,6,8],[1,2,3,4,5,6,8,9],[1,2,3,4,5,6,8,9,10],[1,2,3,4,5,6,8,10],[1,2,3,4,5,6,9],[1,2,3,4,5,6,9,10],[1,2,3,4,5,6,10],[1,2,3,4,5,7],[1,2,3,4,5,7,8],[1,2,3,4,5,7,8,9],[1,2,3,4,5,7,8,9,10],[1,2,3,4,5,7,8,10],[1,2,3,4,5,7,9],[1,2,3,4,5,7,9,10],[1,2,3,4,5,7,10],[1,2,3,4,5,8],[1,2,3,4,5,8,9],[1,2,3,4,5,8,9,10],[1,2,3,4,5,8,10],[1,2,3,4,5,9],[1,2,3,4,5,9,10],[1,2,3,4,5,10],[1,2,3,4,6],[1,2,3,4,6,7],[1,2,3,4,6,7,8],[1,2,3,4,6,7,8,9],[1,2,3,4,6,7,8,9,10],[1,2,3,4,6,7,8,10],[1,2,3,4,6,7,9],[1,2,3,4,6,7,9,10],[1,2,3,4,6,7,10],[1,2,3,4,6,8],[1,2,3,4,6,8,9],[1,2,3,4,6,8,9,10],[1,2,3,4,6,8,10],[1,2,3,4,6,9],[1,2,3,4,6,9,10],[1,2,3,4,6,10],[1,2,3,4,7],[1,2,3,4,7,8],[1,2,3,4,7,8,9],[1,2,3,4,7,8,9,10],[1,2,3,4,7,8,10],[1,2,3,4,7,9],[1,2,3,4,7,9,10],[1,2,3,4,7,10],[1,2,3,4,8],[1,2,3,4,8,9],3],[1,2,3,4],[1,2
//失败