package month05.week03.day05;

public class Day05 {
    //给你一个连续的数字，寻找中间缺少的数字
    public int findLackNum(int[] nums){
        //二分查找
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            //如果midVal==中间应该的数字，则说明在右边，否则在左边
            if(nums[mid]==nums[0]+mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left+nums[0];
    }

    public static void main(String[] args) {
        int[] nums={2,3,5,6,7,8};
        int num = new Day05().findLackNum(nums);
        System.out.println(num);
    }
}
