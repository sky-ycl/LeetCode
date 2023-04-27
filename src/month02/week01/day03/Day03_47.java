package month02.week01.day03;
/*47 全排列
 * 给定一个可包含重复数字的序列 nums ，
 * 按任意顺序 返回所有不重复的全排列。
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day03_47 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] isUsed = new boolean[nums.length];
        backTrack(0, nums, isUsed);
        return lists;
    }

    public void backTrack(int start, int[] nums, boolean[] isUsed) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (isUsed[i] || i > start && nums[i] == nums[i - 1] && isUsed[i - 1] == true) {
                continue;
            }
                list.add(nums[i]);
                isUsed[i] = true;
                backTrack(0, nums, isUsed);
                list.remove(list.size() - 1);
                isUsed[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5, 9};
        List<List<Integer>> lists = new Day03_47().permuteUnique(nums);
        System.out.println(lists);
    }
}
