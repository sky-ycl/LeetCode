package month09.week01.day04;

import java.util.Arrays;

public class Day04_34 {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int[] res = new int[]{-1,-1};
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
            else {
                int start = mid;
                int edd = mid;
                int temp = mid;
                while (temp >= 0 && nums[temp] == target) {
                    start = temp;
                    temp--;
                }
                temp = mid;
                while (temp < n && nums[temp] == target) {
                    edd = temp;
                    temp++;
                }
                res[0] = start;
                res[1] = edd;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] res = new Day04_34().searchRange(nums, 2);
        System.out.println(Arrays.toString(res));
    }
}
