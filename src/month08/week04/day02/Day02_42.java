package month08.week04.day02;

import java.util.Stack;

public class Day02_42 {
    public int trap(int[] height) {
        // 单调栈
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                Integer index = stack.pop();
                if (!stack.isEmpty()) {
                    int h = Math.min(height[stack.peek()], height[i]) - height[index];
                    int w = i - stack.peek() - 1;
                    s += h * w;
                }
            }
            stack.push(i);
        }
        return s;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trap = new Day02_42().trap(height);
        System.out.println(trap);
    }
}
