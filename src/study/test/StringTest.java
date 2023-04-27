package study.test;


import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) {
        String s="hello word";
        int index = s.indexOf("llo");
        System.out.println(index);
        String s1="123456";
        /*
        *\\d是锁定所有数组
        *  */
        String s2 = s1.replaceAll("\\d", "*");
        System.out.println(s2);
    }
}
