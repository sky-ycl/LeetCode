package month08.week02.day01;

import java.util.*;

public class Day01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 订单的总数
        int m = scanner.nextInt();  // 关系的数量

        DSU dsu = new DSU(n);

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            dsu.union(a, b);
        }

        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int group = dsu.find(i);
            groups.putIfAbsent(group, new ArrayList<>());
            groups.get(group).add(i);
        }

        List<List<Integer>> result = new ArrayList<>(groups.values());
        result.sort(Comparator.comparingInt(group -> group.get(0)));

        for (List<Integer> group : result) {
            for (int orderId : group) {
                System.out.print(orderId + " ");
            }
            System.out.println();
        }
    }
}

