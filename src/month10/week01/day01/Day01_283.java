package month10.week01.day01;

import java.util.Arrays;

public class Day01_283 {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==0 && j+1<nums.length){
                    swap(nums,j,j+1);
                }
            }
        }
    }
    public void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        new Day01_283().moveZeroes(nums);
    }
}
