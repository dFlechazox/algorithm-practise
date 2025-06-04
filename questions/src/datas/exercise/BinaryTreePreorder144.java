package datas.exercise;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorder144 {
    public List<Integer> preorderTraversal(TreeNode root){                   //递归
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
    public void preorder(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

    public List<Integer> preorderTraversal1(TreeNode root){                    //迭代，用栈
        List<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        while (! stack.isEmpty()){
            TreeNode node = stack.pop();
            ans.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return ans;
    }
}
