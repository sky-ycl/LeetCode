package sort;

import java.util.Arrays;

public class CountSort {
    public int[] countSort(int[] nums){
        //统计数量
        int[] cnt=new int[11];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        //求前缀和
        for (int i = 1; i <=10; i++) {
            cnt[i]+=cnt[i-1];
        }
        //排序
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[cnt[nums[i]-1]]=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,5,8,3,4,9};
        int[] res = new CountSort().countSort(nums);
        System.out.println(Arrays.toString(res));
    }
}
