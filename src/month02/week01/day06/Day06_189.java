package month02.week01.day06;

import java.util.Arrays;

/*189.轮转数组
给定一个整数数组 nums，
将数组中的元素向右轮转 k 个位置，
其中 k 是非负数。*/
public class Day06_189 {
    public void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArr[i];
        }
    }

    //数组翻转
    public void rotate1(int[] nums, int k) {
        int index = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, index - 1);
        reverse(nums, index, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        new Day06_189().rotate1(nums, 3);
    }
}
