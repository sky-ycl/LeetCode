package 蓝桥杯.ycl.week01.day04;

import java.util.Arrays;
import java.util.Scanner;

public class Day04 {
    private static int count=0;
    private static int n=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] nums= {1,2,3,4,5,6,7,8,9};
        dfs(nums, 0);
        System.out.println(count);
    }

    // 全排列
    public static void dfs(int[] nums,int k) {
        if(k==nums.length) {
            //对数组做处理
            check(nums);
            return;

        }
        for(int i=k;i<nums.length;i++) {
            swap(nums, k,i );
            dfs(nums, k+1);
            swap(nums, k, i);
        }
    }

    public static void check(int[] nums) {
        for(int i=0;i<7;i++) {
            int num1 = toInt(nums, 0, i);
            if(num1>=n) {
                return;
            }
            for(int j=i+1;j<=7;j++) {
                int num2=toInt(nums, i+1, j);
                int num3 = toInt(nums, j + 1, 8);
                if(num2%num3==0&&num1+num2/num3==n) {
                    count++;
                }
            }
        }
    }

    //转化为整数
    public static int toInt(int[] nums,int i,int j) {
        int res=nums[i];
        while(i<j) {
            res*=10;
            res+=nums[i+1];
            i++;
        }
        return res;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
