package month12.week02.day02;

import java.util.Arrays;

/*
* 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
* 思路：旋转之后你会发现第i行的第j列元素旋转后会在第arr.length-1-i列的第j行
* */
public class Day02_2 {
    public static void rotate(int[][] matrix) {
        //先创建一个数组
        int[][] arr = new int[matrix.length][matrix.length];
        //遍历matrix数组
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arr[j][arr.length-1-i]=matrix[i][j];
            }
        }
        //在遍历arr数组，将arr数组的值遍历给matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=arr[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
