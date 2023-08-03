package month08.week01.day01;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Day01_1226 {
    public int lastStoneWeight(int[] stones) {
        // 大根堆 优先队列为降序排列
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            Integer a = pq.poll();
            Integer b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
