package month11.week02.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /*两个数组的交集
     * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
     * 返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
     * 可以不考虑输出结果的顺序
     */
    public static List  intersect(int[] nums1, int[] nums2) {
        //对数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 =0;
        int index2 =0;
        List<Integer> list=new ArrayList();
        while (index1<nums1.length&&index2<nums2.length){
            if(nums1[index1]<nums2[index2]){
                index1++;
            }else if(nums1[index1]>nums2[index2]){
                index2++;
            }else{
                list.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int []nums1=new int[]{4,9,5};
        int []nums2=new int[]{1,2,3};
        List list=intersect(nums1,nums2);
        System.out.println(list);
    }
}
