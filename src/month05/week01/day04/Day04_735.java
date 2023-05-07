package month05.week01.day04;

import java.util.Arrays;
import java.util.Stack;

public class Day04_735 {
    public int[] asteroidCollision(int[] asteroids) {
        //创建一个栈
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;
        for (int aster : asteroids) {
            boolean alive = true;
            while (alive && aster < 0 && !stack.isEmpty() && stack.peek() > 0) {
                alive = stack.peek() < -aster;// aster 是否存在
                if (stack.peek() <= -aster) { // 栈顶行星爆炸
                    stack.pop();
                }
            }
            if (alive) {
                stack.push(aster);
            }
        }

        int size = stack.size();
        int[] res = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {-2, -2, 1, -2};
        int[] res = new Day04_735().asteroidCollision(asteroids);
        System.out.println(Arrays.toString(res));
    }
}
