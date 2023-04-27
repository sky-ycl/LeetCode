package month04.week01.day02;

import java.util.*;

public class Day02_20 {
    public boolean isValid(String s) {
        //括号数为奇数
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.peek() != c) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean valid = new Day02_20().isValid("()");

    }
}
