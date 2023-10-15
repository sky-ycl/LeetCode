package month09.week01.day01;

import java.util.ArrayList;
import java.util.List;

public class Day01_46 {
    private List<List<Integer>> lists = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] isUse = new boolean[nums.length];
        backTrack(nums,isUse);
        return lists;
    }

    public void backTrack(int[] nums, boolean[] isUse) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(isUse[i]==false){
                list.add(nums[i]);
                isUse[i] = true;
                backTrack(nums, isUse);
                list.remove(list.size() - 1);
                isUse[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={1, 2, 3};
        List<List<Integer>> res = new Day01_46().permute(nums);
        System.out.println(res);
    }
}
