package month01.week02.day04;

import java.util.LinkedList;
import java.util.List;

public class Day04_01 {
    public void flatten(TreeNode root) {
        List<TreeNode> list=new LinkedList<>();
        pre(root,list);
        TreeNode curNode=root;
        for (int i = 1; i < list.size(); i++) {
            curNode.left=null;
            curNode.right=list.get(i);
            curNode=curNode.right;
        }
    }
    //遍历前序遍历
    public void pre(TreeNode root, List<TreeNode> list) {
        if(root!=null){
            list.add(root);
            pre(root.left,list);
            pre(root.right,list);
        }
    }

    public static void main(String[] args) {

    }
}

