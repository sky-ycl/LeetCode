package sort;

import java.util.Arrays;

//快速排序
public class QuickSort {
    public int[] quickSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                index=nums[index]<nums[j+1]?j+1:index;
            }
            int tmp = nums[nums.length - 1 - i];
            nums[nums.length - i - 1] = nums[index];
            nums[index] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 8, 1, 2, 7, 6, 5, 4, 4, 5, 5, 8, 5, 8, 9, 42352, 89};
        int[] res = new QuickSort().quickSort(nums);
        System.out.println(Arrays.toString(res));
    }
}
