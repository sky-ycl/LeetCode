package month05.week02.day05;

public class Day05_79 {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean[][] tmp=new boolean[m][n];
                boolean res = dfs(board, word, i, j, dir, tmp, 0);
                if(res){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,String word,int x,int y,int[][] dir,boolean[][] tmp,int index){
        if(x<0 || x>board.length-1 || y<0 || y>board[0].length-1 || tmp[x][y]==true){
            return false;
        }
        if(board[x][y]!=word.charAt(index)){
            return false;
        }
        //符合结束条件
        if(index==word.length()-1){
            return true;
        }
        //上下左右
        tmp[x][y]=true;
        boolean res=false;
        for (int i = 0; i < 4; i++) {
            int x1=x+dir[i][0];
            int y1=y+dir[i][1];
            //查看前方能不能走通
            res = dfs(board, word, x1, y1, dir, tmp, index + 1);
            //找到就不必dfs了
            if(res){
                return true;
            }

        }
        tmp[x][y]=false;
        //四个方向都不匹配
        return false;
    }

    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word="ABCESEEEFS";
        boolean res = new Day05_79().exist(board,word);
        System.out.println(res);
    }
}
