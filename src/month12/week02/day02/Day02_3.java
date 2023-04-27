package month12.week02.day02;

import java.util.Arrays;

/*给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，
且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
* */
public class Day02_3 {
    public static int[][] generateMatrix(int n) {
        int curNum=1;//给数组存放的数字
        //行和列
        int row=0;
        int col=0;
        //创建一个数组
        int [][]arr=new int[n][n];
        //该数组是改变移动的方向
        int [][]directions={{0,1},{1,0},{0,-1},{-1,0}};//右下上左
        int directionIndex=0;
        while(curNum<=(n*n)){
            arr[row][col]=curNum;
            curNum++;
            //转头条件
            int nextRow=row+directions[directionIndex][0];
            int nextCol=col+directions[directionIndex][1];
            //判断是否需要转头
            if(nextRow<0||nextRow>=n||nextCol<0||nextCol>=n||arr[nextRow][nextCol]!=0){
                directionIndex=(directionIndex+1)%4; // 顺时针旋转至下一个方向
            }
            //下次循环行和列的坐标
            row=row+directions[directionIndex][0];
            col=col+directions[directionIndex][1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int [][]arr=generateMatrix(4);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
