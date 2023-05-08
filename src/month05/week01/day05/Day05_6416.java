package month05.week01.day05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day05_6416 {
    public int[] distinctDifferenceArray(int[] nums) {
        //通过HashMap来确定左右端有多少个不同的元素
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int[] diff=new int[n];
        int[] suf=new int[n];
        for (int i = n-1; i >= 0; i--) {
            suf[i]=set.size();
            set.add(nums[i]);
        }
        set.clear();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            diff[i]= set.size()-suf[i];
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 2};
        int[] res = new Day05_6416().distinctDifferenceArray(nums);
        System.out.println(Arrays.toString(res));
    }
}
