package month09.week01.day02;


import java.util.ArrayList;
import java.util.List;

public class Day02_22 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs("",n,n);
        return res;
    }

    public void dfs(String str, int left, int right) {
        // 结束条件
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left == right) {
            dfs(str + "(", left - 1, right);
        }
        // 左括号数量小于右括号的数量,说明下一个括号可以是左括号或者是右括号
        if (left < right) {
            if (left > 0) {
                dfs(str + "(", left - 1, right);
            }
            dfs(str + ")", left, right - 1);
        }
    }

    public static void main(String[] args) {
        List<String> list1 = new Day02_22().generateParenthesis(3);
        System.out.println(list1);
        String s="123456asbs";
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);
    }
}
