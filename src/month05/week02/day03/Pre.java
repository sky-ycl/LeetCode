package month05.week02.day03;

import node.treeNode.TreeNode;
import node.treeNode.utils.TreeNodeUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Pre {
    private List<Integer> list=new LinkedList<>();
    /*
        使用非递归的方式实现前序遍历
     */
    public void pre(TreeNode root){
        if(root==null){
            return;
        }
        //创建一个栈
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNodeUtil.buildTreeNode();
        Pre pre = new Pre();
        pre.pre(root);
        System.out.println(pre.list);

    }
}
