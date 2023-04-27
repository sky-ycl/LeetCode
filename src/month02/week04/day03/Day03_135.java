package month02.week04.day03;

import java.util.Arrays;

/*n 个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。
你需要按照以下要求，给这些孩子分发糖果：
每个孩子至少分配到 1 个糖果。
相邻两个孩子评分更高的孩子会获得更多的糖果。
请你给每个孩子分发糖果，计算并返回需要准备的 最少糖果数目 。
*/
public class Day03_135 {
    public int candy(int[] ratings) {
        int []res=new int[ratings.length];
        Arrays.fill(res,1);
        //计算糖果总和
        int sum=0;
        res[0]=1;
        //右边的孩子比左边的孩子高的时
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i]>ratings[i-1]){
               res[i]=res[i-1]+1;
            }
        }
        //左边的孩子比右边的孩子高的时
        for (int j=ratings.length-2;j>=0;j--){
            if(ratings[j]>ratings[j+1]){
                res[j]=Math.max(res[j],res[j+1]+1);
            }
        }
        for (int i = 0; i < res.length; i++) {
            sum+=res[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []ratings={1,2,2,5,4,3,2};
        int candy = new Day03_135().candy(ratings);
    }
}
