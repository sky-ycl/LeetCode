package month04.week04.day02;

import month03.week04.day02.Day02_16;

import java.util.Arrays;

/*给你一个整数数组 nums 和一个整数 k 。
每一步操作中，你需要从数组中选出和为 k 的两个整数，并将它们移出数组。
返回你可以对数组执行的最大操作数。
*/
public class Day02_1679 {
    public int maxOperations(int[] nums, int k) {
        //排序
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        int count=0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < k) left++;
            else if (sum > k) right--;
            else {
                nums[left] = 0;nums[right] = 0;left++;right-- ;count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={3,1,3,4,3};
        int res = new Day02_1679().maxOperations(nums,6);
        System.out.println(res);
    }
}
