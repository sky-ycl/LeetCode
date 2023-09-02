package month08.week03.day01;

import java.util.*;

/**
 * title 前k个高频元素
 */
public class Day01_347 {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            return o1[1] - o2[1];
        });
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 遍历map集合
        map.keySet().stream().forEach(key->{
            queue.add(new int[]{key,map.get(key)});
        });
        int[] res=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=queue.poll()[0];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3};
        int[] arr = new Day01_347().topKFrequent(nums, 2);
        System.out.println(Arrays.toString(arr));
    }
}
