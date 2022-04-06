import java.util.Stack;

import javax.swing.tree.TreeNode;

/* T.C: O(n), A.S: O(h) */

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<Integer>();
        if(root == null)
            return preorder;
        Stack<TreeNode> q = new Stack<TreeNode>();
        q.push(root);
        while(!q.isEmpty()) {
            root = q.pop();
            preorder.add(root.val);
            if(root.right != null)
                q.push(root.right);
            if(root.left != null)
                q.push(root.left);
        }
        return preorder;
    }
}