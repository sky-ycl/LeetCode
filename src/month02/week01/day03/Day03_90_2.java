package month02.week01.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day03_90_2 {
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        backTrack(0,nums,list);
        return lists;
    }
    public void backTrack(int start,int []nums,List<Integer> list){
        lists.add(list);
        for (int i=start;i<nums.length;i++){
            //去重，如果当前元素和上一个元素相同，直接退出当前循环
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            List<Integer> newList=new ArrayList<>(list);
            newList.add(nums[i]);
            backTrack(i+1,nums,newList);
        }
    }

    public static void main(String[] args) {
        int []nums={1,2,2};
        List<List<Integer>> lists = new Day03_90_2().subsetsWithDup(nums);
        System.out.println(lists);
    }
}
