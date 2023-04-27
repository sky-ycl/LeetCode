package month01.week04;

import java.util.Arrays;

/*给你一个非负整数数组 nums 。在一步操作中，你必须：
选出一个正整数 x ，x 需要小于或等于 nums 中 最小 的 非零 元素。
nums 中的每个正整数都减去 x。
返回使 nums 中所有元素都等于 0 需要的 最少 操作数。
*/
public class Day04_2357 {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        //统计次数
        int count = 0;
        int preNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            preNum = nums[i];
            for (int j = i; j < nums.length; j++) {
                nums[j] -= preNum;
            }
            count++;
            if (nums[nums.length - 1] == 0) {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcd");
        String s = stringBuffer.deleteCharAt(0).toString();
        System.out.println(s);

    }
}
