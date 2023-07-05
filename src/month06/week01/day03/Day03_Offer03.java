package month06.week01.day03;

import java.util.LinkedList;
import java.util.List;

public class Day03_Offer03 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            //当前的元素作为下标
           int k=nums[i];
           if(k<0) k+=n;
           if(nums[k]<0) return k;
           nums[k]-=n;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        int number = new Day03_Offer03().findRepeatNumber(nums);
        System.out.println(number);
    }
}
