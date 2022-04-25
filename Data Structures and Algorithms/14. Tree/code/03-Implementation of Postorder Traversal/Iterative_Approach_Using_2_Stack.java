import java.util.Stack;

import javax.swing.tree.TreeNode;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        List<Integer> postorder = new ArrayList<Integer>();

        if(root == null) return postorder;

        st1.push(root);
        while(!st.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if(root.left != null)
                st1.push(root.left);
            if(root.right != null)
                st1.push(root.right);
        }
        while(!st2.isEmpty()){
            posorder.add(st2.pop().val);
        }
        return postorder;
    }
}