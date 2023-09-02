package month08.week01.day02;

import java.util.Scanner;

public class Day02_Offer65 {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(getCount(n));
        }
    }

    public static int getCount(int n) {
        if (n < 3) {
            return n;
        }
        int totalSoda = 0;
        while (n >= 3) {
            int newSoda = n / 3;
            totalSoda += newSoda;
            n = n % 3 + newSoda;
        }
        if(n==2) totalSoda++;
        return totalSoda;
    }
}
