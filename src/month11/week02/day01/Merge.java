package month11.week02.day01;

import java.util.Arrays;

public class Merge {
    /* 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2,
    * 另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
    * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
    * */
    public void sort(int num1[],int num2[],int m,int n){
        int a=0;
        for(int i=m;i<num1.length;i++){
            //合并数组
            num1[i]=num2[a++];
        }
        //排序数组
        Arrays.sort(num1);
        //输出数组
        for (int j = 0; j < num1.length; j++) {
            System.out.print(num1[j]+" ");
        }
    }
    //双指针解法
    public void sort1(int num1[],int num2[],int m,int n){
        int p1=0;
        int p2=0;
        int cur = 0;//记录两个数组更小的那个数
        //num3[]为num1[]和num[]2合并的数组
        int []num3=new int[m+n];
        while(p1<m||p2<n){
            if(p1==m) {
                cur=num2[p2++];
            }else if(p2==m){
                cur=num1[p1++];
            }else if(num1[p1]<=num2[p2]){
                cur=num1[p1++];
            }else if(num1[p1]>num2[p2]) {
                cur = num2[p2++];
            }
                num3[p1+p2-1]=cur;
        }
        //输出数组
        for (int j = 0; j < num3.length; j++) {
            System.out.print(num3[j]+" ");
        }
    }
    public static void main(String[] args) {
        int []num1={1,2,3,0,0,0};
        int []num2={2,5,6};
        new Merge().sort1(num1,num2,3,3);
    }
}
