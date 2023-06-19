package sort;

import org.junit.Test;
import util.ArrayUtil;

import java.util.Arrays;

public class SelectSort {

    public void selectSort(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int maxIndex = i;
            int minIndex = j;
            for (int k = i; k <= j; k++) {
                //找到最小值和最大值的地址
                maxIndex = nums[k] > nums[maxIndex] ? k : maxIndex;
                minIndex = nums[k] < nums[minIndex] ? k : minIndex;
            }
            ArrayUtil.swap(nums,j,maxIndex);
            if(minIndex==j){
                minIndex=maxIndex;
            }
            ArrayUtil.swap(nums,i,minIndex);
        }
    }

    @Test
    public void testSelectSort(){
        boolean res = ArrayUtil.testSort();
        System.out.println(res);
    }
}
