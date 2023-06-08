package study.sort;

import util.ArrayUtil;

import java.util.Arrays;

public class QuickSort {

    /**
     * 快速排序
     * @param nums
     * @param left
     * @param right
     * @return
     */
    public static void quickSort(int[] nums, int left, int right) {
        //结束条件
        if (left > right) {
            return;
        }
        int cur = nums[left];
        int i = left;
        int j = right;
        while(i<j){
            //找到左边第一个小于cur的值
            while (i < j && cur <= nums[j]) {
                j--;
            }
            //找到左边第一个大于cur的值
            while (i < j && cur >= nums[i]) {
                i++;
            }
            ArrayUtil.swap(nums, i, j);
        }
        //将cur和nums[i]交换
        ArrayUtil.swap(nums, left, i);
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }
    public static void main(String[] args) {
        int[] nums = ArrayUtil.createArray(10);
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
