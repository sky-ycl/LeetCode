package 蓝桥杯.ycl.week01.day04;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArrTest {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        swap(nums,0,2);
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] nums,int i,int j) {
        int tmp=nums[j];
        nums[j]=nums[i];
        nums[i]=tmp;
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}

