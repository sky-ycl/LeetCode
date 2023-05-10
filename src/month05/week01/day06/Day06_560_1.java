package month05.week01.day06;

import java.util.HashMap;
import java.util.Map;

public class Day06_560_1 {
    //前缀和+哈希表
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int pre=0;
        int n = nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
