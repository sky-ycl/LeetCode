package month09.week01.day04;

public class Day04_540 {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 0) {
                if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) left = mid + 1;
                else right = mid;
            } else {
                if (mid - 1 > 0 && nums[mid - 1] == nums[mid]) left = mid + 1;
                else right = mid;
            }
        }
        return nums[right];
    }
}
