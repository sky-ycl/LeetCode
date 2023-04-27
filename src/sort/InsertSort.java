package sort;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = {5,766,42,63,2567,254,532,757,23};
        for (int i = 0; i < 99; i++) {
            //int num = random.nextInt(99);
            //nums[i] = num;
        }
        int[] arr = insertSort(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int j = i;
            while (j > 0) {
                if (nums[j - 1] > cur) {
                    nums[j] = nums[j - 1];
                } else {
                    nums[j] = cur;
                    break;
                }
                j--;
            }

        }
        return nums;
    }
}
