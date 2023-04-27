package study.test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    //哈希表
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[]{};
        String str="Hello world";
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.binarySearch(arr1,1));
        char  c=97;
        System.out.println(c);
    }
}
