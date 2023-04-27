package month12.week01.day03;

import java.util.ArrayList;
import java.util.List;

public class day03_02  {
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList();
        pre(root,res);
        return res;
    }
    public static void pre(TreeNode node,List<Integer> res){
        if(node==null){
            return;
        }
        res.add(node.val);
        pre(node.left,res);
        pre(node.right,res);
    }

}
