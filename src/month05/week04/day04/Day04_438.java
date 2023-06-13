package month05.week04.day04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Day04_438 {
    //滑动窗口
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        if(m>n){
            return new LinkedList<>();
        }
        List<Integer> list=new LinkedList<>();
        int[] nums1=new int[26];
        for (int i = 0; i < m; i++) {
            nums1[p.charAt(i)-'a']++;
        }
        for (int i = 0; i < n-m+1; i++) {
            int[] nums2=new int[26];
            for(int j=i,count=0;count<m;j++,count++){
                nums2[s.charAt(j)-'a']++;
            }
            if(isLegal(nums1,nums2)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isLegal(int[] nums1,int[] nums2){
        return Arrays.equals(nums1,nums2);
    }

    public static void main(String[] args) {
        String s="abab";
        String p="ab";
        List<Integer> res = new Day04_438().findAnagrams(s,p);
        System.out.println(res);
    }
}
