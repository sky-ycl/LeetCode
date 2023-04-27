package 蓝桥杯.ycl.week01.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class Day03_01 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        String  temp=scanner.next();
        String  date[]=temp.split("/");
        String y=date[0],m=date[1],d=date[2],
                yMd=(Integer.parseInt(y)<60?"20"+y:"19"+y)+"-"+m+"-"+d,
                mDy=(Integer.parseInt(d)<60?"20"+d:"19"+d)+"-"+y+"-"+m,
                dMy=(Integer.parseInt(d)<60?"20"+d:"19"+d)+"-"+m+"-"+y;

        TreeSet<String> set = new TreeSet<String>();
        if(f(yMd)) set.add(yMd);
        if(f(mDy)) set.add(mDy);
        if(f(dMy)) set.add(dMy);
        //02/03/04
        for (Object object : set) {
            System.out.println(object);
        }
    }
    static boolean  f(String date){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        try {
            format.parse(date);
        }catch (Exception e){
            return  false;
        }
        return  true;
    }
}
