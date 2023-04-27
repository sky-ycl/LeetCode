package 蓝桥杯.ycl.week01.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day04_606 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i < 2019; i++) {
            for (int j =i; j < 2019; j++) {
                for (int k =j; k < 2019; k++) {
                    if(i+j+k==2019 && isLegal(i) && isLegal(j) && isLegal(k)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static  boolean isLegal(int num){
        String s=""+num;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='2' || s.charAt(i)=='4'){
                return false;
            }
        }
        return true;
    }
}
