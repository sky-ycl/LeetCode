package month08.week04.day03;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Day03_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
        }
        res[0] = nums[deque.peekFirst()];
        for (int i = 1; i < n - k + 1; i++) {
            if (i > deque.peekFirst() || deque.size() > k) deque.pollFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i + k - 1]) {
                deque.pollLast();
            }
            deque.offer(i + k - 1);
            Integer index = deque.peekFirst();
            res[i] = nums[index];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = new Day03_239().maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(res));
    }
}
