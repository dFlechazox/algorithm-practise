package datas.exercise;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorder94 {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
    public void inorder(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
