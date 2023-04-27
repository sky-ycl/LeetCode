package month03.week04.day06;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Day06_95 {
    public List<TreeNode> generateTrees(int n) {
        return dfs(1, n);
    }

    public List<TreeNode> dfs(int start, int edd) {
        List<TreeNode> listTree = new LinkedList<>();
        if (start > edd) {
            listTree.add(null);
            return listTree;
        }
        //此时表示以i为头节点
        for (int i = start; i <= edd; i++) {
            //获取所有可行的左子树集合
            List<TreeNode> leftList = dfs(start, i - 1);
            //获取可行的右子树集合
            List<TreeNode> rightList = dfs(i + 1, edd);
            // 从左子树集合中选出一棵左子树，从右子树集合中选出一棵右子树，拼接到根节点上
            for (TreeNode left : leftList) {
                for (TreeNode right : rightList) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    listTree.add(node);
                }
            }
        }
        return listTree;
    }

    public static void main(String[] args) {
        List<TreeNode> list = new Day06_95().generateTrees(3);
        System.out.println(list);
    }
}
