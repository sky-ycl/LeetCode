package month12.week01.day05;

import java.util.HashMap;
import java.util.Map;

/*给定一个大小为 n 的数组 nums ，返回其中的多数元素。
多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素
*/
public class Day5_02 {
    public static Map<Integer,Integer> countNums(int []nums){
        Map<Integer,Integer> map =new HashMap<>();
        for (Integer num : nums) {
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        return map;
    }
    public static int majorityElement(int[] nums) {
        int res=0;
        Map<Integer,Integer> map=countNums(nums);
        for (Integer key : map.keySet()) {
            if(map.get(key)>nums.length/2){
               res=key;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []nums={2,2,1,1,1,2,2};
        int res=majorityElement(nums);
        System.out.println(res);
    }
}
