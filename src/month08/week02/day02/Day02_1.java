package month08.week02.day02;


import java.util.Scanner;

public class Day02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] distances = new long[n + 1];
        long totalDistance = 0;

        for (int i = 1; i <= n; i++) {
            distances[i] = scanner.nextLong();
            totalDistance += distances[i];
        }

        long a = scanner.nextLong();
        long c = scanner.nextLong();
        long y = scanner.nextLong();

        long forwardDistance = 0;
        for (long i = a; i != c; i = (i % n) + 1) {
            forwardDistance += distances[(int) i];
        }

        long backwardDistance = totalDistance - forwardDistance;

        long minDistance = Math.min(forwardDistance, backwardDistance);
        long result = Math.min(minDistance, Math.abs(forwardDistance - y));

        System.out.println(result);
    }
}
