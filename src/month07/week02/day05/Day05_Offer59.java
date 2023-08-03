package month07.week02.day05;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Day05_Offer59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        // 初始化
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
        }
        res[0] = nums[deque.peekFirst()];
        for (int i = 1; i + k - 1 < n; i++) {
            if (deque.peekFirst() < i) deque.pollFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i+k-1]) {
                deque.pollLast();
            }
            deque.offer(i+k-1);
            res[i]=nums[deque.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        Deque deque = new LinkedList();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        //deque.push(1);
        //deque.push(2);
        int[] nums={1,3,-1,-3,5,3,6,7};
        int[] ints = new Day05_Offer59().maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(ints));
    }
}
