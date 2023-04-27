package month03.week02.day02;

/*
给你一个由'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
此外，你可以假设该网格的四条边均被水包围。
*/
public class Day02_200 {
    public int numIslands(char[][] grid) {
        //计算陆地的数量
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //如果是陆地的话
                if(grid[i][j]=='1'){
                    Area(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void Area(char [][]grid ,int row ,int col ){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length ){
            return;
        }
        //判断是否是陆地
        if(grid[row][col]!='1'){
            return;
        }
        grid[row][col]='2';
        //上下左右
        Area(grid,row-1,col);
        Area(grid,row+1,col);
        Area(grid,row,col-1);
        Area(grid,row,col+1);
    }
}
