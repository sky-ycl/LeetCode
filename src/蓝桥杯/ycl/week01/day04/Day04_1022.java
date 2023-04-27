package 蓝桥杯.ycl.week01.day04;

public class Day04_1022 {
    private static int count=0;
    public static void main(String[] args) {
        int[][]nums=new int[4][4];
        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums[0].length;j++) {
                dfs(nums, i, j, 0);
            }
        }
        System.out.println(count);
    }
    public static void dfs(int[][]nums,int i,int j,int num) {
        if(i<0 || j<0 || i>=nums.length || j>=nums[0].length || nums[i][j]==1 ) {
            return ;
        }
        if(num==15) {
            count++;
            return;
        }
        nums[i][j]=1;
        dfs(nums, i-1, j, num+1);
        dfs(nums, i+1, j, num+1);
        dfs(nums, i, j-1, num+1);
        dfs(nums, i, j+1, num+1);
        nums[i][j]=0;
    }
}
//552