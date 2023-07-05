package month06.week01.day01;

import java.util.*;

public class Day01_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 1) {
            return nums;
        }
        //创建一个双向队列(存放元素的下标)
        Deque<Integer> deque = new LinkedList<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
        }
        res[0] = nums[deque.peekFirst()];
        for (int i = 1; i + k - 1 < n; i++) {
            if(deque.peekFirst()<i){
                deque.pollFirst();
            }
            //始终保持双向队列是递减的
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i + k -1]) {
                deque.pollLast();
            }
            deque.offer(i+k-1);
            res[i]=nums[deque.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        //9, 10, 9, -7, -4, -8, 2, -6
        int[] nums = {9, 10, 9, -7, -4, -8, 2, -6};
        int[] res = new Day01_239().maxSlidingWindow(nums, 5);
        System.out.println(Arrays.toString(res));
    }
}
