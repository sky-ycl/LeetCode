package month01.week01.day04;

import java.util.Arrays;

/*
* 给你一个按 非递减顺序 排序的整数数组 nums，
* 返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序*/
public class Day04_03 {
    public int[] sortedSquares(int[] nums) {
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        //将数组排序
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] res = new Day04_03().sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }
}
