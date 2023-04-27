package month02.week03.day02;

import java.util.*;

public class Day02_2341 {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        Set<Integer> set = map.keySet();
        int keepNum=0;
        int answer=0;
        for (Integer key : set) {
            //看有多少对数
            answer+=map.get(key)/2;
            //看剩下多少数字
            keepNum+=map.get(key)%2;
        }
        int []res={answer,keepNum};
        return res;

    }

    public static void main(String[] args) {
        int []nums={0};
        int[] res = new Day02_2341().numberOfPairs(nums);
        System.out.println(Arrays.toString(res));
    }
}
