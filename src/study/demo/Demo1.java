package study.demo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int date = scan.nextInt();
        for (int i = date + 1; ; i++) {
            int res = method(i);
            if (res != -1) {
                System.out.println(i);
                break;
            }
        }
        for (int j = date + 1; ; j++) {
            String s = j + "";
            if (s.charAt(0) == s.charAt(2) && s.charAt(1) == s.charAt(3) && s.charAt(0) != s.charAt(1)) {
                int res = method(j);
                if (res != -1) {
                    System.out.println(j);
                    break;
                }
            }
        }
       /* String s="123";
        System.out.println(s.charAt(0)==s.charAt(2));*/
    }

    public static int method(int date) {
        int left = 0;
        String s = date + "";
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return -1;
            }
            left++;
            right--;
        }
        return date;
    }
}
