package month10.week01.day01;

import node.treeNode.TreeNode;

import java.util.*;

public class Day01_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums;
        int[] res = new int[n];
        res[0] = 1;
        int temp = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            temp *= nums[i + 1];
            res[i] *= temp;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = new Day01_238().productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
        Queue<Integer> queue = new LinkedList<>();
        int i = new Day01_238().jumpFloor(2);
        System.out.println(i);
    }

    public int jumpFloor (int number) {
        // write code here
        if(number==1) return 1;
        int[] dp=new int[number+1];
        // 初始化
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<number+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[number];
    }

}
