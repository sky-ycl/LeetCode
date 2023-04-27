package month02.week02.day02;

public class Day02_34 {
    public int[] searchRange(int[] nums, int target) {
        //数组长度为0
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0, right = nums.length - 1;
        //二分查找
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                //看看mid左右边是否还有等于target的元素
                int midLeft = mid - 1;
                int midRight = mid + 1;
                while (midLeft >= 0 && nums[midLeft] == target) {
                    midLeft = midLeft - 1;
                }
                while (midRight < nums.length && nums[midRight] == target) {
                    midRight = midRight + 1;
                }
                return new int[]{midLeft + 1, midRight - 1};
            }
        }
        //没有找到target
        return new int[]{-1, -1};
    }
}
