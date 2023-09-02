package month08.week02.day04;


import java.util.HashMap;
import java.util.Map;

public class Day04_3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int num = new Day04_3().lengthOfLongestSubstring("abba");
        System.out.println(num);
    }
}
