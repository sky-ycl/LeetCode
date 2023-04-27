package month02.week01.day06;

import java.util.Arrays;

/*977 有序数组的平方
给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，
要求也按 非递减顺序 排序。*/
public class Day06_977 {
    //双指针方法一
    public int[] sortedSquares(int[] nums) {
        //找到最后一个非0的元素
        int elementIndex = -1;
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                elementIndex = i;
            } else {
                break;
            }
        }
        //双指针
        int left = elementIndex, right = elementIndex + 1;
        //存放结果的数组
        int[] res = new int[nums.length];
        int index = 0;
        while (left >= 0 || right < nums.length) {
            //如果左指针小于0的话 直接将右边的剩下的元素放到res数组中
            if (left < 0) {
                res[index++] = nums[right] * nums[right];
                right++;
            //如果右指针小于0的话 直接将左边的剩下的元素放到res数组中
            } else if (right > nums.length - 1) {
                res[index++] = nums[left] * nums[left];
                left--;
            } else if (nums[left] * nums[left] < nums[right] * nums[right]) {
                res[index++] = nums[left] * nums[left];
                left--;
            } else {
                res[index++] = nums[right] * nums[right];
                right++;
            }
        }
        return res;
    }

    //双指针二
    public int[] sortedSquares1(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1, pos = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                res[pos] = nums[right] * nums[right];
                right--;
            } else {
                res[pos] = nums[left] * nums[left];
                left++;
            }
            pos--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -3, 0, 1, 2};
        int[] ints = new Day06_977().sortedSquares1(nums);
        System.out.println(Arrays.toString(ints));
    }
}
