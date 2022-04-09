class Solution {
    public boolean findTarget(TreeNode root, int k) {
         Set<Integer> set = new HashSet<>();
         boolean ans = find(root, k, set);
        
        return ans ? true : false;
        
    }
    public boolean find(TreeNode root, int sum, Set<Integer> set){
        
        if(root == null) return false;
        
        if(find(root.left, sum, set)== true){
            return true;
        }
        if(set.contains(sum - root.val)){
            return true;
        }
        set.add(root.val);
        
        return find(root.right, sum, set);
    }
}