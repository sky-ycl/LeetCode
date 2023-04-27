package month01.week05.day03;

public class Day03_Offer53 {
    public int search(int[] nums, int target) {
        int count = 0;
        int left = 0, right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid=(left+right)/2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = left + 1;
            } else {
                count++;
                int midLeft = mid - 1, midRight = mid + 1;
                while (midLeft >= 0 && nums[midLeft] == target) {
                    count++;
                    midLeft--;
                }
                while (midRight < nums.length && nums[midRight] == target) {
                    count++;
                    midRight++;
                }
                return count;
            }
        }
        return count;
    }
}
