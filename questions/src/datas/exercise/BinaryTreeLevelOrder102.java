package datas.exercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder102 {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null){
            queue.add(root);
        }
        while (! queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
