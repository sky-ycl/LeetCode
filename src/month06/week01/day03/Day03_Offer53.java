package month06.week01.day03;

/*
一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
*/
public class Day03_Offer53 {
    public int missingNumber(int[] nums) {
        //二分查找
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int midVal = (nums[left] + nums[right]) / 2;
            int mid = (left + right) / 2;
            if (mid == midVal) {
                left = mid + 1;
            } else {
                right = right - 1;
            }
        }
        return left;
    }
}
