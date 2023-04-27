package month04.week01.day05;

import java.math.BigDecimal;
import java.util.*;

public class Day05_2107 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val=arr[i];
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        //记录每个元素的数量
        List<Integer> list=new ArrayList<>();
        //取出所有的key
        Set<Integer> key = map.keySet();
        for (Integer nums : key) {
            //存在相同数量的元素
            if(list.contains(map.get(nums))){
                return false;
            }
            list.add(map.get(nums));
        }
        return true;
    }

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal(20);
        BigDecimal bigDecimal2 = new BigDecimal(30);
        BigDecimal bigDecimalSum = bigDecimal1.add(bigDecimal2);
        System.out.println(bigDecimal1); // 20
        System.out.println(bigDecimal2); // 30
        System.out.println(bigDecimalSum); // 50
    }
}
