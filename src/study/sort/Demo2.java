package study.sort;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Date date = new Date(1000*60);
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(date));
    }
}
