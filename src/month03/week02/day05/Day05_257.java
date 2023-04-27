package month03.week02.day05;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Day05_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return null;
        }
        String s = "";
        List<String> list = new LinkedList<>();
        return dfs(root, list, s);
    }

    public List<String> dfs(TreeNode root, List<String> list, String s) {
        if (root == null) {
            list.add(s);
            return null;
        }
        s += root.val + "->";
        dfs(root.left, list, s);
        dfs(root.right, list, s);
        return list;
    }
}
