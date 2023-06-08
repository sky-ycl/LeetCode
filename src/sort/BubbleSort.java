package sort;


import util.ArrayUtil;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(nums[j]>nums[j+1]){
                    ArrayUtil.swap(nums,j,j+1);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = ArrayUtil.createArray(8);
        int[] ints = bubbleSort(nums);
        System.out.println(Arrays.toString(ints));
    }
}
