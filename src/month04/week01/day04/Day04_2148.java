package month04.week01.day04;

import java.util.LinkedList;
import java.util.Scanner;

public class Day04_2148 {
    static LinkedList<Integer> path =  new LinkedList<>();
    static int res = 0, mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        dfs(a, 0);
        System.out.println(res % mod);
    }

    private static void dfs(int[] a, int startindex) {
        int n = a.length;
        if (startindex == n) {
            res ++;
            return;
        }
        for (int i = startindex; i < n; i++) {
            if (check(a, startindex, i)) {
                path.add(i);
                dfs(a, i + 1);
                path.removeLast();
            }
        }
    }

    private static boolean check(int[] a, int l, int r) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        return max - min == r - l;
    }
}
