package month04.week02.day05;

import java.util.ArrayList;
import java.util.List;

/*
* 给你一个数组candies和一个整数extraCandies，其中candies[i]代表第 i 个孩子拥有的糖果数目。
对每一个孩子，检查是否存在一种方案，将额外的extraCandies个糖果分配给孩子们之后，此孩子有 最多的糖果。
* 注意，允许有多个孩子同时拥有 最多的糖果数目。
*/
public class Day05_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //找到目前拥有糖果数量最多的孩子
        int max=0;
        for (int candy : candies) {
            if(candy>max) max=candy;
        }
        List<Boolean> list=new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
