package 蓝桥杯.ycl.week01.day01;

import java.util.Scanner;

public class Day01_2080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        long []arr=new long[size];
        long sum=0;
        for (int i = 0; i < size; i++) {
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        //乘法分配律
        long res=0;
        for (int i = 0; i < arr.length-1; i++) {
            sum-=arr[i];
            res+=arr[i]*sum;
        }
        System.out.println(res);
    }
}
