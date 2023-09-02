package month08.week02.day01;

public class DSU {
    private int[] parent;

    public DSU(int n) {
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        parent[find(x)] = find(y);
    }
    public static void main(String[] args) {
        int n = 5;  // 元素数量
        DSU dsu = new DSU(n);

        dsu.union(1, 2);
        dsu.union(2, 3);

        System.out.println(dsu.find(3));
        System.out.println(dsu.find(1) == dsu.find(3));  // 输出：true，表示 1 和 3 属于同一个集合
        System.out.println(dsu.find(2) == dsu.find(4));  // 输出：false，表示 2 和 4 不属于同一个集合
    }
}

