package month02.week04.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*四数之和
给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。
请你找出并返回满足下述全部条件且不重复的四元组 
[nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
0 <= a, b, c, d < n
a、b、c 和 d 互不相同
nums[a] + nums[b] + nums[c] + nums[d] == target
你可以按 任意顺序 返回答案 。
*/
public class Day05_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int j = 0; j < nums.length-3; j++) {
            long val1=target-nums[j];
            //剪枝
            if (nums[j] > target && nums[j] > 0 && target > 0) {
                break;
            }
            //去重
            if (j > 0 && nums[j] == nums[j - 1]) {
                continue;
            }
            for (int i = j+1; i < nums.length - 2; i++) {
                if(i>j+1&&nums[i]==nums[i-1]){
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                long val2=val1-nums[i];
                while (left < right) {
                    if (val2 > nums[left] + nums[right]) {
                        left++;
                    } else if (val2 < nums[left] + nums[right]) {
                        right--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[j]);
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        lists.add(list);
                        //去重
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int []nums={1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        List<List<Integer>> lists = new Day05_18().fourSum(nums,target);
        System.out.println(lists);
    }
}
