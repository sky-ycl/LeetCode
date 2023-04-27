package month12.week02.Day04;
/*
* 给你一个整数数组 nums，返回 数组 answer ，
* 其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
* 前提：请不要使用除法，且在 O(n) 时间复杂度内完成此题。
* 思路：1.初始化两个空数组 L 和 R。对于给定索引 i，L[i] 代表的是 i 左侧所有数字的乘积，R[i] 代表的是 i 右侧所有数字的乘积。
2.我们需要用两个循环来填充 L 和 R 数组的值。对于数组 L，L[0] 应该是 1，因为第一个元素的左边没有元素。对于其他元素：L[i] = L[i-1] * nums[i-1]。
3.同理，对于数组 R，R[length-1] 应为 1。length 指的是输入数组的大小。其他元素：R[i] = R[i+1] * nums[i+1]。
4.当 R 和 L 数组填充完成，我们只需要在输入数组上迭代，且索引 i 处的值为：L[i] * R[i]。
 */

import java.util.Arrays;

public class Day04_01 {
    public int[] productExceptSelf(int[] nums) {
        // 1.初始化两个空数组 L 和 R。对于给定索引 i，L[i] 代表的是 i 左侧所有数字的乘积，R[i] 代表的是 i 右侧所有数字的乘积。
        int []L=new int[nums.length];
        L[0]=1;
        int []R=new int[nums.length];
        R[nums.length-1]=1;
        //2.我们需要用两个循环来填充 L 和 R 数组的值。对于数组 L，L[0] 应该是 1，因为第一个元素的左边没有元素。对于其他元素：L[i] = L[i-1] * nums[i-1]。
        for (int i = 1; i < nums.length; i++) {
            L[i]=L[i-1]*nums[i-1];
        }
        //3.同理，对于数组 R，R[length-1] 应为 1。length 指的是输入数组的大小。其他元素：R[i] = R[i+1] * nums[i+1]。
        for (int i =nums.length-2;i>=0;i--) {
            R[i]=R[i+1]*nums[i+1];
        }
        //4.当 R 和 L 数组填充完成，我们只需要在输入数组上迭代，且索引 i 处的值为：L[i] * R[i]。
        int []arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=L[i]*R[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int []res=new Day04_01().productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
