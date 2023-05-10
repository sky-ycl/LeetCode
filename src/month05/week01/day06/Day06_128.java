package month05.week01.day06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day06_128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        int n = nums.length;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <n; i++) {
            set.add(nums[i]);
        }
        int[] arr=new int[set.size()];
        int index=0;
        for (Integer num : set) {
            arr[index++]=num;
        }
        //数组排序
        Arrays.sort(arr);
        int left=0,right=0;
        //数字连续的最长序列
        int  maxLen=1;
        while(right<arr.length-1){
            if(arr[right+1]-arr[right]==1){
                maxLen=Math.max(maxLen,(right+1)-left+1);
            }else{
                left=right+1;
            }

            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums={0,0};
        int res = new Day06_128().longestConsecutive(nums);
        System.out.println(res);
    }
}
