class Solution {
    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        int curr = root.val;
        if(curr < p.val && curr < q.val) 
            return LCA(root.right, p, q);
        if(curr > p.val && curr > q.val)
            return LCA(root.left, p, q);
        return root;
    }
}