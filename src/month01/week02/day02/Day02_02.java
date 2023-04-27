package month01.week02.day02;

import java.util.HashMap;
import java.util.Map;

/*
* 给你一个下标从 0 开始长度为 n 的字符串 num ，它只包含数字。
如果对于 每个 0 <= i < n 的下标 i ，
* 都满足数位 i 在 num 中出现了 num[i]次，
* 那么请你返回 true ，否则返回 false 。
*/
public class Day02_02 {
    public boolean digitCount(String num) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        //key表示i,value表示i在num[i]出现的次数
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if(Integer.parseInt(num.substring(j,j+1))==i){
                    count++;
                }
            }
            map.put(i,count);
            count=0;
        }
        for (int i = 0; i < num.length(); i++) {
            if(map.get(i)!=Integer.parseInt(num.substring(i,i+1))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String num="030";
        //Map<Integer, Integer> map = new Day02_02().digitCount(num);
        boolean b = new Day02_02().digitCount(num);
        System.out.println(b);
        int i = Integer.parseInt(num.substring(0,1));
        System.out.println(i);
        int i1=num.charAt(0)-'0';
        System.out.println(i1);
        //System.out.println(map);
    }
}
