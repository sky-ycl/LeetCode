package month07.week02.day03;

public class Day03_Offer12 {
    private String word;
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        this.word = word;
        this.board = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] direct = new boolean[board.length][board[0].length];
                if (dfs(i, j, 0, direct)) return true;
            }

        }
        return false;
    }

    public boolean dfs(int i, int j, int k, boolean[][] direct) {
        // 表示已经找到了
        if (k >= word.length()) return true;
        // 结束条件
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(k) || direct[i][j] == true)
            return false;
        direct[i][j] = true;
        Boolean res = dfs(i - 1, j, k + 1, direct) || dfs(i + 1, j, k + 1, direct) || dfs(i, j - 1, k + 1, direct) || dfs(i, j + 1, k + 1, direct);
        direct[i][j]=false;
        return res;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        boolean res = new Day03_Offer12().exist(board, "ABCESEEEFS");
        System.out.println(res);
        int m=3^4;
        System.out.println(m);
    }
}
