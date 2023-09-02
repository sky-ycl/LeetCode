package month08.week03.day02;

import java.util.Arrays;

public class Day02_Offer61 {
    public boolean isStraight(int[] nums) {
        // 记录大小王
        int count=0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n-1; i++) {
            if(count<0) return false;
            if(nums[i]==0) count++;
            if(nums[i]>0){
              int num=nums[i+1]-nums[i];
              if(num-1>count || num==0){
                    return false;
              }
              count=count-num+1;
            }
        }
        return true;
    }
}
