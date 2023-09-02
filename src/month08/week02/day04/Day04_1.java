package month08.week02.day04;

import java.util.Scanner;

public class Day04_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] like = new int[n];
        for (int i = 0; i < n; i++) {
            like[i]=scan.nextInt();
        }
        int m = scan.nextInt();
        // 存放结果
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int q = scan.nextInt();
            res[i] = check(l, r, q, like);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int check(int l, int r, int q, int[] like) {
        int count = 0;
        for (int i = l - 1; i < r; i++) {
            if (like[i] == q) count++;
        }
        return count;
    }
}
