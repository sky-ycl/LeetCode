package sort.util;

import java.util.Random;

public class SortUtil {
    public static int[] sortUtil(int num){
        int[] nums=new int[num];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i]=random.nextInt(num+1);
        }
        return nums;
    }
}
