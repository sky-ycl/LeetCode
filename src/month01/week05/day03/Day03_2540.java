package month01.week05.day03;

import java.util.LinkedList;
import java.util.Map;

/*给你两个整数数组 nums1 和 nums2 ，它们已经按非降序排序，请你返回两个数组的 最小公共整数 。
如果两个数组 nums1 和 nums2 没有公共整数，请你返回 -1 。
如果一个整数在两个数组中都 至少出现一次 ，那么这个整数是数组 nums1 和 nums2 公共 的。
。*/
public class Day03_2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                return nums1[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2};
        int[] nums2 = {1, 2};
        int res = new Day03_2540().getCommon(nums1, nums2);
        System.out.println(res);
    }
}
