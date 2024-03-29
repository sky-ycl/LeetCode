package month05.week03.day04;

import org.junit.Test;

import java.util.*;

public class Day04_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        //创建一个栈
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        //存放结果的数组
        int[] res = new int[n];
        for (int i = 0 ; i < n; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }

    @Test
    public void testDailyTemperatures() {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        Queue<Integer> queue = new LinkedList<>();
        int[] nums={73,74,75,71,69,72,76,73};
        int[] ints = new Day04_739().dailyTemperatures(nums);
        System.out.println(Arrays.toString(ints));
    }
}
