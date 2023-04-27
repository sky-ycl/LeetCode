package month02.week04.day02;


/* 跳跃游戏II
给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。
换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
0 <= j <= nums[i] 
i + j < n
返回到达 nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
*/
public class Day01_45 {
    public int jump(int[] nums) {
        //数组长度为1时
        if (nums.length == 1) {
            return 0;
        }
        int maxIndex = 0, curMaxIndex = 0, curIndex = 0,count=0;
        while (true) {
            maxIndex = curIndex + nums[curIndex];
            count++;
            if(maxIndex>=nums.length-1){
                return count;
            }
            for (int i = curIndex; i <= maxIndex; i++) {
                if (curMaxIndex < i + nums[i]) {
                    curMaxIndex=i+nums[i];
                    if(curMaxIndex>=nums.length-1){
                        return ++count;
                    }
                    curIndex=i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr={2,3,1,1,4};
        int res = new Day01_45().jump(arr);
        System.out.println(res);
    }
}
