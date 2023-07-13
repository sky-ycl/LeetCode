package month07.week01.day03;

import java.util.LinkedList;
import java.util.List;

/*
 * 反转字符串的顺序
 * */
public class Day03_Offer58 {
    public String reverseWords(String s) {
        //去除前后空白
        String str = s.trim();
        StringBuilder res = new StringBuilder();
        int j = str.length() - 1;
        int i = j;
        while (i >= 0) {
            // 找到第一个空格
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }
            res.append(str.substring(i + 1, j + 1)+" ");
            // 去除中间的空格
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }
            j=i;
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s="  hello world!  ";
        String s1 = new Day03_Offer58().reverseWords(s);
        System.out.println(s1);
    }
}
