package util;

import org.junit.Test;

import java.util.Random;

public class ArrayUtil {

    /**
     * 打印一个数组
     * @param nums
     * @return
     */
    public static String toString(int[] nums){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if(nums.length==0){
            builder.append("]");
            return builder.toString();
        }
        for (int i = 0; i < nums.length; i++) {
            if(i==nums.length-1){
                builder.append(nums[i]+"]");
                break;
            }
            builder.append(nums[i]+",");
        }
        return builder.toString();
    }

    /**
     * 随机生成一个数组
     * @param length
     * @return
     */
    public static int[] createArray(int length){
        Random random = new Random();
        int[] nums=new int[length];
        for (int i = 0; i < length; i++) {
            nums[i]=random.nextInt(length+1);
        }
        return nums;
    }

    /**
     * 交换两个数组的元素
     */
    public static void swap(int[] nums,int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }


    @Test
    public void testArray(){
        int[] nums = createArray(8);
        String s = toString(nums);
        System.out.println(s);
    }
}
