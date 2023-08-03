package month07.week02.day02;

import java.util.HashMap;
import java.util.Map;

public class Day02_Offer48 {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0;
        while (right<s.length()){
            char c = s.charAt(right);
            if(map.containsKey(c)) left=Math.max(left,map.get(c) + 1);
            map.put(c,right);
            max=Math.max(right-left+1,max);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int i = new Day02_Offer48().lengthOfLongestSubstring("abba");
        System.out.println(i);
    }
}
