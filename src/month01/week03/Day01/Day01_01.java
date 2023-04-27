package month01.week03.Day01;

import java.util.Arrays;

public class Day01_01 {
    /*给定一个包含 [0, n] 中 n 个数的数组 nums ，
    找出 [0, n] 这个范围内没有出现在数组中的那个数。*/
    public int missingNumber(int[] nums) {
        //将数组排序好
        Arrays.sort(nums);
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    /*给定两个字符串 s 和 t ，它们只包含小写字母。
    字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
    请找出在 t 中被添加的字母。*/
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            index=s.charAt(i)-'a';
            arr[index]++;
        }
        for (int i = 0; i < t.length(); i++) {
            index=t.charAt(i)-'a';
            arr[index]--;
            if(arr[index]<0){
                char c= (char) (97+index);
                return c;
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        int a='a';
        System.out.println(a);
    }

}
