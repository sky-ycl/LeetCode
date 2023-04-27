package month01.week01.day05;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*1.两数之和
给定一个整数数组 nums 和一个整数目标值 target，
请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
*/
public class Day05_02 {
    public int[] sum(int []nums,int target){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    int []arr={i,j};
                    return arr;
                }
            }
        }
        return null;
    }
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        //int[] arr = new Day05_02().sum(nums,26);
        int[] arr = new Day05_02().twoSum(nums,26);

        System.out.println(Arrays.toString(arr));
    }
}
