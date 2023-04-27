package month11.week01.day4;

import java.util.Arrays;

public class RepeatElement {
    public boolean containsDuplicate(int []nums){
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }

        }
            return false;
    }

    public static void main(String[] args) {
        int []nums =new int[]{1,1,1,3,3,4,3,2,4,2};
        Arrays.sort(nums);//将数组自动排序
        boolean result=new RepeatElement().containsDuplicate(nums);
        System.out.println(result);
        //数组降序
        for (int start=0,end=nums.length-1;start<=end;start++,end--){
            int p=nums[end];
            nums[end]=nums[start];
            nums[start]=p;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
