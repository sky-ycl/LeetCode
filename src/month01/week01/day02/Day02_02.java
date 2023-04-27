package month01.week01.day02;

import java.util.ArrayDeque;
import java.util.Queue;

public class Day02_02 {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }
    public static void main(String[] args) {

    }
}
