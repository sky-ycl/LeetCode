package month07.week01.day01;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Day01_Offer34 {
    private List<List<Integer>> lists = new LinkedList<>();
    private List<Integer> list = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return lists;
        }
        dfs(root, target, 0);
        return lists;
    }

    public void dfs(TreeNode root, int target, int sum) {
        if (root == null) {
            return;
        }
        //计算和
        sum += root.val;
        // 当是叶子节点的时候 是和是否为target
        if (root.left == null && root.right == null) {
            if (sum == target) {
                list.add(root.val);
                lists.add(new LinkedList<>(list));
                list.remove(list.size()-1);
            }
            return;
        }
        list.add(root.val);
        dfs(root.left, target, sum);
        dfs(root.right, target, sum);
        sum -= root.val;
        list.remove(list.size() - 1);
    }
}
