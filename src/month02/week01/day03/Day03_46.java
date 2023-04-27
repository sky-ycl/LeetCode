package month02.week01.day03;


import java.util.ArrayList;
import java.util.List;

public class Day03_46 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        //空数组
        if(nums.length==0){
            return lists;
        }
        //记录数字是否使用过
        boolean[] isUsed = new boolean[nums.length];
        backTrack(0,nums,isUsed);
        return lists;
    }

    public void backTrack(int start, int[] nums, boolean[] isUsed) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (!isUsed[i]) {
                isUsed[i]=true;
                list.add(nums[i]);
                //每次回溯的时候从0开始
                backTrack(0, nums, isUsed);
                list.remove(list.size() - 1);
                isUsed[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        List<List<Integer>> lists = new Day03_46().permute(nums);
        System.out.println(lists);
    }
}
