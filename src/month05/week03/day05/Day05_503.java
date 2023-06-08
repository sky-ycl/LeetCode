package month05.week03.day05;

import java.util.*;

/**
 * title 下一个更大元素 II
 * 给定一个循环数组nums（nums[nums.length - 1]的下一个元素是nums[0]），返回nums中每个元素的 下一个更大元素 。
 * 数字 x的 下一个更大的元素 是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 */
public class Day05_503 {
    public int[] nextGreaterElements(int[] nums) {
        //思路：单调栈+平摊数组(取模)
        Deque<Integer> stack = new LinkedList<>();
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for (int i = 0; i < n * 2; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                res[stack.pop()] = nums[i % n];
            }
            stack.push(i%n);
        }
        return res;
    }
}
