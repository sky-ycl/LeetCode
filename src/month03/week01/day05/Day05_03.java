package month03.week01.day05;

import java.util.HashMap;
import java.util.Map;

/*给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。*/
public class Day05_03 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxLen = 0;
        int start = 0;
        //创建一个map集合
        Map<Character,Integer> map=new HashMap<>();
        for(int edd=0;edd<s.length();edd++){
            if(map.containsKey(s.charAt(edd))){
                start=Math.max(map.get(s.charAt(edd))+1,start);
            }
            maxLen=Math.max(maxLen,edd-start+1);
            map.put(s.charAt(edd),edd);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int res = new Day05_03().lengthOfLongestSubstring("abcabcbb");
        System.out.println(res);
    }
}
