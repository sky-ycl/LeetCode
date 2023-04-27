package month04.week02.day04;

import java.util.HashMap;
import java.util.Map;

/*给定两个字符串s和t，判断它们是否是同构的。
如果s中的字符可以按某种映射关系替换得到t，那么这两个字符串是同构的。
每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。
不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
著*/
public class Day04_205 {
    public boolean isIsomorphic(String s, String t) {
        //长度不一样
        if (s.length() != t.length()) {
            return false;
        }
        //创建一个哈希表
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1) ) {
                if (map.get(c1) != c2 ) {
                    return false;
                }
            }
            if(map1.containsKey(c2)){
                if(map1.get(c2)!=c1){
                    return false;
                }
            }
            map.put(c1, c2);
            map1.put(c2,c1);
        }
        return true;
    }
}
