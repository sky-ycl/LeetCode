package month01.week05.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，
找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 
对于给定的输入，保证和为 target 的不同组合数少于 150 个。
*/
public class Day05_39 {
    List<List<Integer>> lists=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    int sum=0;
    public void backStack(int [] candidates,int index,int target){
        if(sum==target){
            lists.add(new LinkedList<>(list));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=index;i<candidates.length && sum + candidates[i] <= target;i++){
            list.add(candidates[i]);
            sum=sum+list.get(list.size()-1);
            backStack(candidates,i,target);
            sum=sum-list.get(list.size()-1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        if(candidates==null){
            return lists;
        }
        backStack(candidates,0,target);
        return lists;
    }

    public static void main(String[] args) {
        int []candidates={2,3,5};
        int target=8;
        List<List<Integer>> lists = new Day05_39().combinationSum(candidates,target);
        System.out.println(lists);
    }
}
