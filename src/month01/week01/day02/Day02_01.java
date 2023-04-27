package month01.week01.day02;

import java.util.HashMap;
import java.util.Map;

/*
* 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
这里的 遵循 指完全匹配，
例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律
*/
public class Day02_01 {
    public boolean wordPattern(String pattern, String s) {
        //将两个字符串装进数组里
        String[] str2 = s.split(" ");
        //长度不同直接返回false
        if (str2.length != str2.length) {
            return false;
        }
        //长度相同
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < str2.length; i++) {
            //判断规律是否一致
            if (map.put(pattern.charAt(i), i) != map.put(str2[i], i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "ccdd";
        String s = "s s t t";
        boolean res = new Day02_01().wordPattern(pattern, s);
        System.out.println(res);
    }
}
