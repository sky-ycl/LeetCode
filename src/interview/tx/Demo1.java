package interview.tx;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public int minOperations(String str) {
        //26小写字母
        int charNum = 26;
        int res = 0;
        //统计字母剩余个数
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        //统计每个字符的数量
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //遍历map集合
        for (Character key : map.keySet()) {
            //如果value是偶数的话
            int value = map.get(key);
            if (value == 1) {
                charNum--;
            }
            if (value % 2 == 0) {
                res += value / 2;
                charNum -= value / 2;
            }
            //如果value是奇数的话
            if (value > 1 && value % 2 != 0) {
                res += value / 2;
                charNum -= value / 2+1;
            }
        }
        if(charNum<0){
            res-=charNum;
        }
        return res;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int res = demo1.minOperations("ababcd");
        System.out.println(res);
    }
}
