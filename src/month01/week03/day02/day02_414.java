package month01.week03.day02;

import java.util.Arrays;

/*
 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 */
public class day02_414 {
    public int thirdMax(int[] nums) {
        //将数组排序
        Arrays.sort(nums);
        int count=1;
        //遍历数组
        for (int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                count++;
            }
            //当count==3时，此时nums[i]是第三大的数字
            if(count==3){
                return nums[i];
            }
        }
        //没有找到第三大的数字
        return nums[nums.length-1];
    }

    public static void main(String[] args) {

    }
}
