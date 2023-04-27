package month04.week04.day03;

import java.util.HashMap;
import java.util.Map;

public class Day03_424 {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        if (len < 2) {
            return len;
        }
        int left = 0;
        int right = 0;

        int res = 0;
        int maxCount = 0;
        int[] arr=new int[26];
        while(right<s.length()){
            char c = s.charAt(right);
            arr[c-'A']++;
            maxCount=Math.max(maxCount,arr[c-'A']);
            right++;
            if(maxCount+k<right-left){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            res=Math.max(res,right-left);
        }
        return res;
    }

    public static void main(String[] args) {
        int res = new Day03_424().characterReplacement("AABCABBB", 2);
        System.out.println(res);
    }
}
