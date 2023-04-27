package 蓝桥杯.ycl.week01.day01;

import java.util.*;

public class Day01_544 {
    public static void main(String[] args) {
        Deque<Integer> stack=new LinkedList<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.poll();
        System.out.println(stack);
    }
}
