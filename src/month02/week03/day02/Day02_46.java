package month02.week03.day02;

import java.util.ArrayList;
import java.util.List;

/*给定一个不含重复数字的数组 nums ，
返回其 所有可能的全排列 。
你可以 按任意顺序 返回答案。*/
public class Day02_46 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        //空数组
        if(nums.length==0){
            return lists;
        }
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
            if (!isUsed[i]) {
                list.add(nums[i]);
                isUsed[i] = true;
                backTrack(0, nums, isUsed);
                isUsed[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> lists = new Day02_46().permute(nums);
        System.out.println(lists);
    }
}
