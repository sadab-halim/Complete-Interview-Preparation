class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

class Main {
    /* ------------------ T.C: O(n), A.S: O(h) ------------------ */
    public static boolean isBalanced(Node root) {
        return dfsHeight(root) != -1;
    }

    public static int dfsHeight (Node root) {
        if(root == null)
            return 0;
        int leftHeight = dfsHeight(root.left);
        if(leftHeight == -1)
            return -1;
        int rightHeight = dfsHeight(root.right);
        if(rightHeight == -1)
            return -1;
        
        if(Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        if(isBalanced(root))
            System.out.println("Tree is balanced.");
        else
            System.out.println("Tree is not balanced.");
    }
}