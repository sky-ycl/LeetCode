package month02.week03.day02;

import java.util.Arrays;

/*给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
请你找出并返回这两个正序数组的 中位数 。
算法的时间复杂度应该为 O(log (m+n)) 。
*/
public class Day02_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //合并数组
        int m = nums1.length;
        int n = nums2.length;
        int[] mergeArray = new int[m + n];
        int index = 0;
        double midVal = 0;
        for (int val : nums1) {
            mergeArray[index++] = val;
        }
        for (int val : nums2) {
            mergeArray[index++] = val;
        }
        Arrays.sort(mergeArray);

        //二分查找
        int left = 0, right = mergeArray.length - 1;
        while (left <= right) {
            //找到中位数
            if (left == right || left + 1 == right) {

                midVal = ((double) mergeArray[left] + (double) mergeArray[right]) / 2;
                return midVal;
            }
            left++;
            right--;
        }
        return 0;
    }

    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        //合并数组
        int m = nums1.length;
        int n = nums2.length;
        int[] mergeArray = new int[m + n];
        int index = 0;
        double midVal = 0;
        for (int val : nums1) {
            mergeArray[index++] = val;
        }
        for (int val : nums2) {
            mergeArray[index++] = val;
        }
        Arrays.sort(mergeArray);
        //判断合并后的数组长度是奇数还是偶数
        int left = 0, right = mergeArray.length - 1;
        int mid = 0;
        double midVal1 = 0;
        //若是偶数，两边元素相加除2便是中位数
        if (mergeArray.length % 2 == 0) {
            mid = (left + right) / 2;
            midVal1 = ((double) mergeArray[mid] + (double) mergeArray[mid + 1]) / 2;
            return midVal1;
        }
        //若数组长度是奇数，中间的那个元素便是中位数
        if (mergeArray.length % 2 == 1) {
            mid = (left + right) / 2;
            return mergeArray[mid];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double midVal = new Day02_4().findMedianSortedArrays1(nums1, nums2);
        System.out.println(midVal);
        double b = (2.0 + 3.0) / 2;
        System.out.println(b);
    }
}
