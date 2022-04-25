class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

class Efficient_Method {
    /* ------------------ T.C: O(n), A.S: O(h) ------------------ */
    static int diameter;
    public static int getMaxDepth(Node root) {
        if(root == null)
            return 0;
        int leftDepth = getMaxDepth(root.left);
        int rightDepth = getMaxDepth(root.right);
        diameter = Math.max(diameter, leftDepth + rightDepth);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static int getDiameter(Node root) {
        diameter = 0;
        getMaxDepth(root);
        return diameter;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        int res = getDiameter(root);
        System.out.println(res);
    }
}