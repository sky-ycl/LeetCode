package 蓝桥杯.ycl.week01.day02;

import java.util.Calendar;

public class Day02_02 {
    public static void main(String[] args) {
        // 获得Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 设置时间
        calendar.set(1900, 0, 1);
        // 获得年份
        int year = calendar.get(Calendar.YEAR);
        //统计数量
        int count=0;
        while (year <= 9999) {
            year = calendar.get(Calendar.YEAR); // 获得月份(注意：月份是从0开始的)
            int month = calendar.get(Calendar.MONTH) + 1; // 获得天数 int day =
            int day = calendar.get(Calendar.DATE);
            calendar.get(Calendar.DATE);
            int yearSum = getSum(year);
            int monthSum = getSum(month);
            int daySum = getSum(day);
            if(yearSum==monthSum+daySum) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static int getSum(int time) {
        int sum = 0;
        while (time > 0) {
            sum += time % 10;
            time /= 10;
        }
        return sum;
    }
}
