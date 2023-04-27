package 蓝桥杯.ycl.week01.day04;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<int[]> list1=new ArrayList<>();
        list1.add(arr);
        if(!list1.contains(arr)){
            list1.add(arr);
        }
        System.out.println(list1);
    }
}
