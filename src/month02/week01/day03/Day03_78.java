package month02.week01.day03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*给你一个整数数组 nums ，数组中的元素 互不相同 。
返回该数组所有可能的子集（幂集）。
解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */
public class Day03_78 {

    List<List<Integer>> lists = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        backTrack(0,nums,list);
        return lists;
    }

    public void backTrack(int start, int[] nums, List<Integer> list) {
        //因为空集是任何子集的子集
        lists.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            List<Integer> newList=new ArrayList<>(list);
            newList.add(nums[i]);
            backTrack(i + 1, nums, newList);
        }
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        List<List<Integer>> lists = new Day03_78().subsets(nums);
        System.out.println(lists);
    }
}
