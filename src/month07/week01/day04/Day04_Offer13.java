package month07.week01.day04;

public class Day04_Offer13 {
    public int movingCount(int m, int n, int k) {
        int[][] arr = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, k, m, n, visited);
    }

    public int dfs(int row, int col, int k, int m, int n, boolean[][] visited) {
        // 结束条件
        if (row < 0 || col < 0 || row >= m || col >= n || !isLegal(row, col, k) || visited[row][col]) return 0;
        visited[row][col] = true;
        return 1 + dfs(row + 1, col, k, m, n, visited) + dfs(row, col + 1, k, m, n, visited);
    }

    public boolean isLegal(int row, int col, int k) {
        return (getSum(row) + getSum(col)) <= k;
    }

    public int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int count = new Day04_Offer13().movingCount(2, 3, 1);
        System.out.println(count);
    }
}
