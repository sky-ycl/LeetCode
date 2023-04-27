package month04.week01.day05;

import java.util.Arrays;

public class Day05_1365_2 {
    //计数排序
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt=new int[101];
        //统计数量
        for (int i = 0; i <nums.length; i++) {
            cnt[nums[i]]++;
        }
        //前缀和
        for (int i = 1; i <=100; i++) {
            cnt[i]+=cnt[i-1];
        }
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i]=nums[i]==0?0:cnt[nums[i]-1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] ints = new Day05_1365_2().smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ints));
    }
}
