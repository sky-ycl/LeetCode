package 蓝桥杯.ycl.week01.day02;

import java.util.Calendar;

public class Day02_01 {
    public static void main(String[] args) {
        //创建一个Calendar对象
        Calendar calendar = Calendar.getInstance();
        //设置时间
        //注意这个月份是从0开始的
        calendar.set(2022,0,1);
        int year=2022;
        int count=0;
        while(year<2023){
            calendar.add(Calendar.DATE,1);
            count++;
            year = calendar.get(Calendar.YEAR);
        }
        System.out.println(count);
    }
}
