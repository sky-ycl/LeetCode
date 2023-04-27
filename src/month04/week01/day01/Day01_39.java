package month04.week01.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day01_39 {
    private List<Integer> list=new ArrayList<>();
    private List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates,0,target,0);
        return lists;
    }

    public void backTrack(int[] nums,int sum,int target,int start){
        if(sum==target){
            lists.add(new ArrayList<>(list));
            return;
        }
        if(sum>target){
            return;
        }

        for(int i=start;i<nums.length;i++){
            sum+=nums[i];
            if(sum>target){
                break;
            }
            list.add(nums[i]);
            backTrack(nums,sum,target,i);
            sum-=nums[i];
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={2,3,5};
        List<List<Integer>> lists = new Day01_39().combinationSum(nums,8);
        System.out.println(lists);
    }
}
