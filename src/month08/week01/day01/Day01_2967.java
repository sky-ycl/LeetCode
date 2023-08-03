package month08.week01.day01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Day01_2967 {
    public int[] topKFrequent(int[] nums, int k) {
        // 通过哈希表记录每个元素的个数
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // 创建小堆根
        PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        for (Integer key : map.keySet()) {
            // 当前元素频率和优先队列的第一个元素频率比较
            Integer value=map.get(key);
            if(queue.size()==k){
                // 如果当前元素的频率比优先队列的第一个元素的频率高时
                if(queue.peek()[1]<value){
                    queue.poll();
                    queue.offer(new int[]{key,value});
                }
            }else{
                queue.offer(new int[]{key,value});
            }
        }
        int[] res=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=queue.poll()[0];
        }
        return res;
    }
}
