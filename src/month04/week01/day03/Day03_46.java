package month04.week01.day03;

import java.util.ArrayList;
import java.util.List;

//全排列
public class Day03_46 {
    private List<List<Integer>> lists = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] isUsed = new boolean[nums.length];
        backTrack(nums, isUsed);
        return lists;
    }

    public void backTrack(int[] nums, boolean[] isUsed) {
        //结束条件
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!isUsed[i]) {
                list.add(nums[i]);
                isUsed[i] = true;
                backTrack(nums, isUsed);
                list.remove(list.size() - 1);
                isUsed[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = new Day03_46().permute(nums);
        System.out.println(permute);
    }
}
