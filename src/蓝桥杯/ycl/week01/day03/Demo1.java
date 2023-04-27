package 蓝桥杯.ycl.week01.day03;


import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入：");
        String  str=scanner.next();
        System.out.println("你输入的是"+str);

        scanner= new Scanner(System.in);//重新搞
        System.out.println("请输入：");
        String  str1=scanner.nextLine();
        System.out.println("你输入的是"+str1);

    }
}
