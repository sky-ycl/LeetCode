package month01.week05.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day03_2089 {
    public List<Integer> targetIndices1(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                list.add(mid);
                int midLeft = mid - 1, midRight = mid + 1;
                while (nums[midLeft] == target) {
                    list.add(midLeft);
                    midLeft--;
                }
                while (nums[midRight] == target) {
                    list.add(midRight);
                    midRight++;
                }
                return list;
            }
        }
        return null;
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
                if (i < nums.length && nums[i + 1] != target) {
                    break;
                }
            }
        }
        return list;
    }
}
