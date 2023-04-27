package month03.week01.day01;

/*整数数组 nums 按升序排列，数组中的值 互不相同 。
在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，
使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
*/
public class Day01_33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        //二分查找
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            //寻找中间的地址
            int midIndex = (left + right) / 2;
            //如果target在中间的位置
            if (nums[midIndex] == target) {
                return midIndex;
            }
            //有序的部分
            if (nums[0] <= nums[midIndex]) {
                //看target是否在有序的部分里
                if (nums[0] <= target && target < nums[midIndex]) {
                    right = midIndex - 1;
                } else {
                    left = midIndex + 1;
                }
                //无序的部分
            } else {
                if (nums[midIndex] < target && target <= nums[nums.length - 1]) {
                    left = midIndex + 1;
                } else {
                    right = midIndex - 1;
                }
            }
        }
        return -1;
    }
}
