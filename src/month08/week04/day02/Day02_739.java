package month08.week04.day02;

import java.util.Stack;

public class Day02_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
                Integer index = stack.pop();
                res[index]=i-index;
            }
            stack.push(i);
        }
        return res;
    }
}
