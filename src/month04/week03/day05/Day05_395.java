package month04.week03.day05;

import java.util.HashMap;
import java.util.Map;

public class Day05_395 {
    public int longestSubstring(String s, int k) {
        //递归结束条件
        if(s.length()<k){
            return 0;
        }
        //统计字符的数量
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }
        }
        for (Character key : map.keySet()) {
            //找到字符个数小于k
            if(map.get(key)<k){
                int res=0;
                for(String t:s.split(""+key)){
                    res=Math.max(res,longestSubstring(t,k));
                }
                return res;
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        int aaabb = new Day05_395().longestSubstring("aaabb", 3);
        System.out.println(aaabb);
    }
}
