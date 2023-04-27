package sort;

import sort.util.SortUtil;

import java.util.Arrays;

public class QuickSort1 {
    public void quickSort(int[] nums, int left, int right) {
        //递归结束条件
        if (left > right) return;
        int val = nums[left];
        int i = left, j = right;
        while (i < j) {
            //找到右边第一个小于目标值的元素
            while (i < j && nums[j] >= val) {
                j--;
            }
            //找到左边第一个大于目标值的元素
            while (i < j && nums[i] <= val) {
                i++;
            }
            swap(nums, i, j);
        }
        swap(nums,left,i);
        quickSort(nums,left,i-1);
        quickSort(nums,i+1,right);
    }

    //交换元素
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = SortUtil.sortUtil(100);
        new QuickSort1().quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
