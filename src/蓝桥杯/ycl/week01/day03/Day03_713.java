package 蓝桥杯.ycl.week01.day03;

import java.util.Scanner;

public class Day03_713 {
    static int[][] arr = new int[4][5];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        System.out.println(dfs(0,0));
        scan.close();
    }

    public static int dfs(int x,int y){
        if (x==3||y==4){
            return 1;
        }else {
            return dfs(x+1,y)+dfs(x,y+1);
        }
    }
}
