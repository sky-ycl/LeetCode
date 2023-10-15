package month09.week01.day02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int day = 1;
        int baoNumber = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                baoNumber += (nums[i] * day) / b;
            }
            if (baoNumber >= a) {
                break;
            }
            baoNumber=0;
            day++;
        }
        System.out.println(day);
    }
}
