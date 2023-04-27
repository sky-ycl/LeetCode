package month02.week02.day03;

import java.util.HashMap;
import java.util.Map;

/*给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
* */
public class Day03_3 {
    public int lengthOfLongestSubstring(String s) {
        //创建map
        Map<Character,Integer> map=new HashMap<>();
        int start=0;
        int maxLen=0;
        for (int end = 0; end < s.length(); end++) {
            if(map.containsKey(s.charAt(end))){
                start=Math.max(map.get(s.charAt(end))+1,start);
            }
            maxLen=Math.max(end-start+1,maxLen);
            map.put(s.charAt(end),end);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s="abba";
        int len = new Day03_3().lengthOfLongestSubstring(s);
        System.out.println(len);
    }
}
