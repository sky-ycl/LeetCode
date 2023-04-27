package study.kmp;

import java.util.Arrays;

public class Kmp {
    //看s1的字符串中是否存在s2字符串
    public int kmp(String s1,String s2) {
        int[] next = kmpNext(s2);
        //遍历字符串
        for (int i = 0, j = 0; i < s1.length(); i++) {
            //没有匹配到字符串
            while (j > 0 && s1.charAt(i) != s2.charAt(j)) {
                j=next[j-1];
            }
            //匹配到字符串
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
            //找到字符串
            if(j==s2.length()){
                return i-j+1;
            }
        }
        //没有找到
        return -1;
    }

    //创建kmp的next数组
    public int[] kmpNext(String s) {
        int[] next = new int[s.length()];
        //设置下标0的数组为0
        next[0] = 0;
        for (int i = 1, j = 0; i < s.length(); i++) {
            //前后缀不相同的情况下
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            //前后缀相同的情况下
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                next[i] = j;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String s1="aabaabaaf";
        String s2="aabaaf";
        int index = new Kmp().kmp(s1, s2);
        System.out.println(index);
    }
}
