package month02.week03.day05;

import java.util.Arrays;

/*给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。
重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
以这种方式修改数组后，返回数组可能的最大和 。
*/
public class Day05_1005 {
    /*思路：
    对数组排序
    1.数组中没有负数：
        要想返回数组可能的最大和，肯定是对nums[0]进行反转
    2.数组中有负数：
        先对小于0的进行反转,然后数组排序
            k没有剩余
                那么这就是返回数组可能的最大和
            k有剩余
               k是奇数
                  对nums[0]进行反转,然后返回sum
               k是偶数
                  直接返回sum
    */
    public int largestSumAfterKNegations(int[] nums, int k) {
        //计算数字的最大和
        int sum = 0;
        //数组排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //将数组中的负数转正,每成功进行一次转正之后,k-1
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        //对k有剩余和没有剩余的情况进行分析,最后返回sum
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }
}
