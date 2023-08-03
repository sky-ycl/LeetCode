package month07.week02.day01;

import java.util.HashMap;
import java.util.Map;

public class Day01_Offer39 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean res = map.containsKey(nums[i]);
            if (res) {
                if (map.get(nums[i]) + 1 > (n / 2)) {
                    return nums[i];
                }
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}
