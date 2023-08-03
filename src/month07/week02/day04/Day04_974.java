package month07.week02.day04;

import java.util.HashMap;
import java.util.Map;

public class Day04_974 {
    public int subarraysDivByK(int[] nums, int k) {
        //创建前缀和
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int modulus = (sum % k + k) % k;
            count+=map.getOrDefault(modulus,0);
            map.put(modulus,map.get(modulus));
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        int i = new Day04_974().subarraysDivByK(nums, 9);
        System.out.println(i);
    }
}
