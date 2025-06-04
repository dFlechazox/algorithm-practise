package datas.exercise;

public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root){
        if (root == null){
            return true;
        }
        return search(root.left, root.right);
    }
    public boolean search(TreeNode left, TreeNode right){                     //递归，可以用队列。懒得写了
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val == right.val){
            return true;
        }
        if (left.val != right.val){
            return false;
        }
        return search(left.left, right.right) && search(left.right, right.left);
    }
}
