package month04.week02.day05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*给你一个整数数组 nums ，返回出现最频繁的偶数元素。
如果存在多个满足条件的元素，只需要返回 最小 的一个。
如果不存在这样的元素，返回 -1 。*/
public class Day05_2404 {
    public int mostFrequentEven(int[] nums) {
        //排序
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        //将偶数元素存放到map集合中
        for (int num : nums) {
            if (num % 2 == 0) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        }
        int max=-1;
        int res=-1;
        //取出map集合中的value
        for (Integer key : map.keySet()) {
            if(map.get(key)>max){
                max=map.get(key);
                res=key;
            }
        }
        return res;
    }
}
//[8267,8727,2649,7359,2142,7824,7399,3424,
// 8868,476,9769,4631,6631,4205,9178,7920,
// 4748,5523,74,5550,516,6448,3475,7867,7041,
// 5896,4382,2066,8101,674,67,9311,4308,1693,
// 4586,3959,2973,2158,5067,9060,2988,1147,1746,
// 9722,8550,9126,3029,1677,4154,5473,6589,5381,
// 1486,8699,792,8349,6773,496,4505,6163,6843,1232,
// 4809,4432,6251,7658,4949,1419,7005,3815,6295,4635,
// 7785,4891,6941,6952,7218,134,2718,7409,9551]