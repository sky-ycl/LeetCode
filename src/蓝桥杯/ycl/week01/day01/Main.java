package 蓝桥杯.ycl.week01.day01;

import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        int count = 0; // 计数器
        Calendar calendar = Calendar.getInstance();
        calendar.set(1900, 0, 1); // 从1900年1月1日开始计算
        while (calendar.get(Calendar.YEAR) <= 9999 && calendar.get(Calendar.MONTH) <= 11 && calendar.get(Calendar.DATE) <= 31) {
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int date = calendar.get(Calendar.DATE);
            int yearDigitSum = getDigitSum(year);
            int monthDigitSum = getDigitSum(month);
            int dateDigitSum = getDigitSum(date);
            if (yearDigitSum == monthDigitSum + dateDigitSum) {
                count++;
            }
            calendar.add(Calendar.DATE, 1); // 计算下一天的日期
        }
        System.out.println(count);
    }
    // 计算一个整数的各个数位上的数字之和
    private static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n %10;
                    n /= 10;
        }
        return sum;
    }
}
