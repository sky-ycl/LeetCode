package month02.week03.day05;

import java.util.HashMap;
import java.util.Map;

public class Day05_2347 {
    public String bestHand(int[] ranks, char[] suits) {
        Map<Character,Integer> suitMap=new HashMap<>();
        Map<Integer,Integer> ranksMap=new HashMap<>();
        //判断花色
        for (char suit : suits) {
            if(!suitMap.containsKey(suit)){
                suitMap.put(suit,1);
            }else{
                suitMap.put(suit,suitMap.get(suit)+1);
            }
            //判断当前有没有5张相同的同花色
            if(suitMap.get(suit)==5){
                return "Flush";
            }
        }
        //判断牌数
        for (int rank : ranks) {
            if(!ranksMap.containsKey(rank)){
                ranksMap.put(rank,1);
            }else{
                ranksMap.put(rank,ranksMap.get(rank)+1);
            }
            //如果有三张相同的牌
            if(ranksMap.get(rank)==3){
                return "Three of a Kind";
            }
        }
        //如果有两张相同的牌
        if(ranksMap.containsValue(2)){
            return "Pair";
        }
        return "High Card";
    }

    public static void main(String[] args) {
        int a=1;
        a=-a;
        System.out.println(a);
    }
}
