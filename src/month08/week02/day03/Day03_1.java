package month08.week02.day03;

import java.util.Stack;

public class Day03_1 {
    public String compress(String str) {
        StringBuilder res = new StringBuilder();
        // stack1 记录个数  stack2 记录字母
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '[') {
                res.append(c);
            } else if (c == '[') {
                // 记录'['得数量
                int count = 1;
                i++;
                String s = "";
                while (count > 0) {
                    c = str.charAt(i);
                    if (c >= '0' && c <= '9') stack1.push(c);
                    if ((c >= 'A' && c <= 'Z') || c == '|') stack2.push(c);
                    if (c == '[') count++;
                    if (c == ']') {
                        StringBuilder builder = new StringBuilder();
                        while ((c = stack2.pop()) != '|') {
                            builder.append(c);
                        }
                        String temp = builder.reverse().append(s).toString();
                        int num = stack1.pop() - '0';
                        for (int j = 0; j < num - 1; j++) {
                            builder.append(temp);
                        }
                        s = builder.toString();
                        count--;
                    }
                    i++;
                }
                i--;
                res.append(s);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res = new Day03_1().compress("A[2|BC]B[2|A]F");
        System.out.println(res);
    }
}
