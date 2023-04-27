package month02.week04.day06;


/*给你一个大小为 n x n 的整数矩阵 grid 。
生成一个大小为 (n - 2) x (n - 2) 的整数矩阵  maxLocal ，并满足：
maxLocal[i][j] 等于 grid 中以 i + 1 行和 j + 1 列为中心的 3 x 3 矩阵中的 最大值 。
换句话说，我们希望找出 grid 中每个 3 x 3 矩阵中的最大值。
返回生成的矩阵。
*/
public class Day06_2373 {
    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal = new int[grid.length - 2][grid.length - 2];
        int max = grid[0][0];
        for (int i = 0; i < maxLocal.length; i++) {
            for (int j = 0; j < maxLocal[0].length; j++) {
                for (int k = i; k < i + 3; k++) {
                    for (int n = j; n < j + 3; n++) {
                        if (k == i + 1 && n == j + 1) {
                            continue;
                        }
                        if (max < grid[k][n]) {
                            max = grid[k][n];
                        }
                    }
                }
                maxLocal[i][j] = max;
                max = 0;
            }
        }
        return maxLocal;
    }

    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 3}, {6, 6, 2, 2}};
        int[][] ints = new Day06_2373().largestLocal(grid);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
