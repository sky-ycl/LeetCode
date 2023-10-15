package month08.week04.day05;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        int res = 1;
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int left = 0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else {
                left=Math.max(left,map.get(nums[i])+1);
            }
            res=Math.max(res,i-left+1);
        }
        System.out.println(res);
    }
}
