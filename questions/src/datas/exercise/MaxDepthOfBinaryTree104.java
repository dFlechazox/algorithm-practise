package datas.exercise;

public class MaxDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root){                  //dfs
        if (root == null){
            return 0;
        }
        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);
        return Math.max(leftheight, rightheight) + 1;
    }
}
