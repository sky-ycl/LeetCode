package month02.week01.day07;

import study.demo.ArrTest;

import java.util.Arrays;

public class Day07_283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        System.out.println(ArrTest.show(nums));
    }

    public static void main(String[] args) {
        int []nums={0,1,0,3,12};
        new Day07_283().moveZeroes(nums);
    }
}
