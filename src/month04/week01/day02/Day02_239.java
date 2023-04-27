package month04.week01.day02;

import java.util.Arrays;

public class Day02_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left;
        int[] arr = new int[nums.length - k + 1];
        int index = 0;
        for (left = 0; left+k-1 < nums.length; left++) {
            int max = Integer.MIN_VALUE;
            for (int j = left; j <= left+k-1; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            arr[index++] = max;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1};
        int[] ints = new Day02_239().maxSlidingWindow(nums, 1);
        System.out.println(Arrays.toString(ints));
    }
}
