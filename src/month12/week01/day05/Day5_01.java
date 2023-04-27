package month12.week01.day05;

import java.util.ArrayList;
import java.util.List;
/*给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。
找出那个只出现了一次的元素。
*/
public class Day5_01 {
    public static int singleNumber1(int []nums){
        int val=0;
        for (int i = 0; i < nums.length; i++) {
            val^=nums[i];
        }
        return val;
    }
    public  static int singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])){
                list.remove(new Integer(nums[i]));
            }else{
                list.add(nums[i]);
            }
        }
        return list.get(0);
    }
    public static void main(String[] args) {
        int []nums={4,1,2,1,2};
        int res=singleNumber(nums);
        System.out.println(res);
        int res1=singleNumber1(nums);
        System.out.println(res1);
    }
}
