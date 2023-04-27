package month04.week02.day01;

import java.util.HashMap;
import java.util.Map;

/*给你一个下标从 0 开始的字符串 s ，该字符串仅由小写英文字母组成，s 中的每个字母都 恰好 出现 两次 。
另给你一个下标从 0 开始、长度为 26 的的整数数组 distance 。
字母表中的每个字母按从 0 到 25 依次编号（即，'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25）。
在一个 匀整 字符串中，第 i 个字母的两次出现之间的字母数量是 distance[i] 。
如果第 i 个字母没有在 s 中出现，那么 distance[i] 可以 忽略 。
如果 s 是一个 匀整 字符串，返回 true ；否则，返回 false 。
*/
public class Day01_2399 {
    public boolean checkDistances(String s, int[] distance) {
        //创建一个哈希表
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                char c = s.charAt(i);
                int val=i-map.get(c)-1;
                int index=c-'a';
                if(distance[index]!=val){
                    return false;
                }
            }
            map.put(s.charAt(i),i);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] distance={1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        boolean b = new Day01_2399().checkDistances("abaccb",distance);
        System.out.println(b);
    }
}
