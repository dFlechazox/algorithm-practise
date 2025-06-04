package datas.exercise;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorder144 {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }
    public void postorder(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}
