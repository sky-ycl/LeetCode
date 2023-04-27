package month04.week01.day05;

import java.util.Scanner;

public class Day05_2378 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int res=(num1+(num2%7))%7==0?7:(num1+(num2%7))%7;
        System.out.println(res);
    }
}
