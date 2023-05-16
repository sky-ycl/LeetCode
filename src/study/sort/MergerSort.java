package study.sort;

import java.util.Arrays;

public class MergerSort {

    //归并排序
    public void mergerSort(int left, int right, int[] nums, int[] temp) {
        //终止条件
        if (left == right) {
            return;
        }
        //找到中间的位置
        int mid = (left + right) / 2;
        //左边排序
        mergerSort(left, mid , nums, temp);
        //右边排序
        mergerSort(mid+1, right, nums, temp);
        mergerArr(left,right,nums,temp);
    }

    public void mergerArr(int left, int right, int[] nums, int[] temp) {
        int mid = (left + right) / 2;
        int i = left;
        int j = mid+1;
        int index = left;
        while (i <=mid && j <= right) {
            temp[index++] = nums[i] < nums[j] ? nums[i++] : nums[j++];
        }
        //如果左边还有元素
        while (i<=mid) {
            temp[index++]=nums[i++];
        }
        //如果右边只有元素
        while(j<=right){
            temp[index++]=nums[j++];
        }
        //将排好序的temp数组赋给nums数组
        for(int k=left;k<=right;k++){
            nums[k]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] nums={1,8,6,9,5,4,2,3,7,9,8};
        int[] temp=new int[nums.length];
        new MergerSort().mergerSort(0,nums.length-1,nums,temp);
        System.out.println(Arrays.toString(nums));
    }
}
