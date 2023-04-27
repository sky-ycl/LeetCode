package month02.week02.day05;

import java.util.HashMap;
import java.util.Map;

public class Day05_13 {
    public int romanToInt(String s) {
        //创建一个哈希表
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int sum = 0;
        int preNum = map.get(s.charAt(0));
        int num = 0;
        for (int i = 1; i < s.length(); i++) {
            num = map.get(s.charAt(i));
            if (preNum < num) {
                sum -= preNum;
            }
            if (preNum > num) {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
}
