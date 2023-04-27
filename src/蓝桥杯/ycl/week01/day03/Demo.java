package 蓝桥杯.ycl.week01.day03;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        String s="123";
        System.out.println(s.contains("4"));
        int [][]arr=new int[2][2];
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return 0;
            }
        });
    }
}
