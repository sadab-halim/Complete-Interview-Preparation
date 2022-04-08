class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;

        int count = 0;
        while(true) {
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            } else {
                if(stack.isEmpty()) {
                    break;
                }
                curr = stack.pop();
                count++;
                if(count == k)
                    return curr.val;
                curr = curr.right;
            }
        }
        return -1;
    }
}