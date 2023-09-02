package month08.week01.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Day03_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] split = scan.nextLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int x = Integer.parseInt(split[1]);
        int y = Integer.parseInt(split[2]);
        String[] temp = scan.nextLine().split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(nums);
        int res = getNum(nums, x, y);
        System.out.println(res);
    }
    public static int getNum(int[] nums,int x,int y){
        int m=-1;
        for (int i = 0; i <= nums.length; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    a = j+1;
                    b = nums.length - a;
                    if(a>=x && a<=y && b>=x && b<=y){
                        m=nums[i];
                        return m;
                    }
                    break;
                }
            }
        }
        return m;
    }
}
