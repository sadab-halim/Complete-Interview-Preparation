class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[][0]);
    }

    public TreeNode bstFromPreorder(int[] preorder, int max, int[] i) {
        if(i[0] == preorder.length || preorder[i[0]] > max)
            return null;
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left = bstFromPreorder(preorder, root.val, i);
        root.right = bstFromPreorder(preorder, max, i);
        return root;
    }
}