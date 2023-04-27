package month12.week01.day04;

import java.util.Arrays;

public class day04_03 {
    /*给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
    注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
    * */
    /*思路：
    t 是 ss 的异位词等价于「两个字符串排序后相等」。
    因此我们可以对字符串 ss 和 tt 分别排序，看排序后的字符串是否相等即可判断。
    此外，如果 ss 和 tt 的长度不同，tt 必然不是 ss 的异位词。
    * */
    public static  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
    public static void main(String[] args) {
        //s = "anagram", t = "nagaram"
        String s="ab";
        String t="ab";
        boolean result=isAnagram(s,t);
        System.out.println(result);
    }
}
