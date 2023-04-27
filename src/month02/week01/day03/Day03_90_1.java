package month02.week01.day03;

import java.util.*;

public class Day03_90_1 {
    Set<List> set = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        backTrack(0, nums, list);
        List<List<Integer>> lists = new ArrayList<>();
        for (List list1 : set) {
            lists.add(list1);
        }
        return lists;
    }

    public void backTrack(int start, int[] nums, List<Integer> list) {
        set.add(list);
        for (int i = start; i < nums.length; i++) {
            List<Integer> newList = new ArrayList<>(list);
            newList.add(nums[i]);
            backTrack(i + 1, nums, newList);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> lists = new Day03_90_1().subsetsWithDup(nums);
        System.out.println(lists);
    }
}
