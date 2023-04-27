package month01.week02.day04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
请必须使用时间复杂度为 O(log n) 的算法。
*/
public class Day04_02 {
    //二分查找
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int index=nums.length;
        int left=0;
        int right=len-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target<=nums[mid]){
                index=mid;
                right=right-1;
            }else{
                left=left+1;
            }
        }
        return index;
    }
}
