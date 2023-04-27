package 蓝桥杯.ycl.week01.day03;

import java.util.Calendar;

public class Day03_720 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1999,12-1,31);
        for(int i=0;i<=100;i++){
            if(calendar.get(Calendar.MONTH)==11&&calendar.get(Calendar.DATE)==31 &&calendar.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(calendar.get(Calendar.YEAR));
                break;
            }
            calendar.add(Calendar.YEAR,100);
        }
        calendar.set(2299,12-1,31);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(2299);
    }
}
