package study.sort;

import util.ArrayUtil;

import java.util.Arrays;

public class InsertSort1 {
    public static int[] insertSort(int[] nums) {
        if (nums == null) {
            return null;
        }
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int j = i;
            while (j - 1 >= 0 && nums[j-1]>cur) {
                swap(nums,j-1,j);
                j--;
            }
            nums[j]=cur;
        }
        return nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = ArrayUtil.createArray(8);
        System.out.println(Arrays.toString(nums));
        int[] ints = insertSort(nums);
        System.out.println(Arrays.toString(ints));
    }
}
