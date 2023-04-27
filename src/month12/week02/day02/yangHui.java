package month12.week02.day02;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/*
*给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
*/
public class yangHui {
    public static List<Integer> yangHui(int rowIndex){
        //创建一个杨辉三角
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i <=rowIndex; i++) {
            List<Integer> res=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j==0||j==i){
                    res.add(1);
                }else{
                    //根据杨辉三角的规律(在「杨辉三角」中，每个数是它左上方和右上方的数的和)
                    res.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(res);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
         List<Integer> result=yangHui(4);
        System.out.println(result);
    }
}
