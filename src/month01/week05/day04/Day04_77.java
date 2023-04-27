package month01.week05.day04;

import java.util.ArrayList;
import java.util.List;

/*给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
你可以按 任何顺序 返回答案。*/
public class Day04_77 {
    List<List<Integer>> listTotal = new ArrayList<>();

    private void backtrack(int n, int k, List<Integer> list, int index) {
        //结束条件
        if(list.size()==k){
            listTotal.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=n-(k-list.size())+1;i++){
            list.add(i);
            backtrack(n,k,list,i+1);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, new ArrayList<Integer>(), 1);
        return listTotal;
    }

    public static void main(String[] args) {
        List<List<Integer>> combine = new Day04_77().combine(4, 3);
        System.out.println(combine);
    }
}
