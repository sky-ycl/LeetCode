package month04.week01.day05;

import java.util.Arrays;

public class Day05_1033 {
    public int[] numMovesStones(int a, int b, int c) {
        //将数值排序
        int[] nums = {a, b, c};
        int[] res=new int[2];
        Arrays.sort(nums);
        if(nums[0]+1!=nums[1]) res[0]++;
        if(nums[1]+1!=nums[2]) res[0]++;
        //其中一边只有一个间隔
        if(nums[1]-nums[0]==2 || nums[2]-nums[1]==2) res[0]=1;
        //最大值
        res[1]=nums[2]-nums[0]-2;
        return res;
    }

    public static void main(String[] args) {
        int[] ints = new Day05_1033().numMovesStones(1, 2, 5);
        System.out.println(Arrays.toString(ints));

    }
}
