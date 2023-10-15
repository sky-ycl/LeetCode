package month10.week01.day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day01_2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            map.keySet().forEach(key -> {
                list.add(key);
                map.put(key, map.get(key) - 1);
                if (map.get(key) == 0) {
                    map.remove(key);
                }
            });
            res.add(new ArrayList<>(list));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> lists = new Day01_2610().findMatrix(nums);
        System.out.println(lists);
        int i=0,j=nums.length;
    }
}
