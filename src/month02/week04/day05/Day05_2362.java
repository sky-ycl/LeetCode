package month02.week04.day05;


import java.util.*;

/*给你两个二维整数数组 items1 和 items2 ，表示两个物品集合。每个数组 items 有以下特质：
items[i] = [valuei, weighti] 其中 valuei 表示第 i 件物品的 价值 ，weighti 表示第 i 件物品的 重量 。
items 中每件物品的价值都是 唯一的 。
请你返回一个二维数组 ret，其中 ret[i] = [valuei, weighti]， weighti 是所有价值为 valuei 物品的 重量之和 。
注意：ret 应该按价值 升序 排序后返回
*/
public class Day05_2362 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        //创建一个map集合
        Map<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0],items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            if(map.containsKey(items2[i][0])){
                map.put(items2[i][0],map.get(items2[i][0])+items2[i][1]);
            }else{
                map.put(items2[i][0],items2[i][1]);
            }
        }
        //从map集合中取出数据
        for (Integer key : map.keySet()) {
            List<Integer> list=new ArrayList<>();
            list.add(key);
            list.add(map.get(key));
            lists.add(list);
        }
        Collections.sort(lists, (a, b) -> a.get(0) - b.get(0));
        return lists;
    }

    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        List<List<Integer>> lists = new Day05_15().threeSum(nums);
        System.out.println(lists);
    }
}
