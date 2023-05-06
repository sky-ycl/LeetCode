package month05.week01.day03;

import java.util.Stack;

/*
给定一个经过编码的字符串，返回它解码后的字符串。

编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。

你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像3a或2[4]的输入。

示例 1：

输入：s = "3[a]2[bc]"
输出："aaabcbc"
示例 2：

输入：s = "3[a2[c]]"
输出："accaccacc"
*/
public class Day03_394 {
    public String decodeString(String s) {
        //res=last_res+multi*res;
        StringBuilder res = new StringBuilder();
        Stack<String> last_res = new Stack<>();
        Stack<Integer> multi = new Stack<>();
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                last_res.push(res.toString());
                multi.push(Integer.parseInt(num.toString()));
                res = new StringBuilder();
                num = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                if (!multi.isEmpty()) {
                    Integer n = multi.pop();
                    for (Integer i = 0; i < n; i++) {
                        temp.append(res);
                    }
                }
                if (!last_res.isEmpty()) {
                    res = new StringBuilder(last_res.pop() + temp);
                } else {
                    res = temp;
                }
            } else if (c >= '0' && c <= '9') {
                num.append(c);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res = new Day03_394().decodeString("23[a]56[b]89[c]");
        System.out.println(res);
    }
}
