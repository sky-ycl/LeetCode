package month04.week03.day06;

import java.util.ArrayList;
import java.util.List;

public class Day06_1456 {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int res=0;
        List<Character> list=new ArrayList<>(){{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
        }};
        int left=0,right=0;
        int count=0;
       while (right<n){
           char c = s.charAt(right);
           if(list.contains(c)) count++;
           while(right-left>=k){
               if(list.contains(s.charAt(left))) count--;
               left++;
           }
           res=Math.max(res,count);
           right++;
       }
       return res;
    }

    public static void main(String[] args) {
        int res = new Day06_1456().maxVowels("weallloveyou", 7);
        System.out.println(res);
    }
}
