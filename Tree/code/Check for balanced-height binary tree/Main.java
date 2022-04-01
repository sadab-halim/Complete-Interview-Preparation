class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

class Naive_Method {
    /* ------------------ T.C: O(n) ------------------ */
    public static boolean isBalanced(Node root) {
        if(root == null)
            return true;
        int leftSubtree = height(root.left);
        int rightSubtree = height(root.right);

        if(Math.abs(leftSubtree - rightSubtree) <= 1 && isBalanced(root.left) && isBalanced(root.right)) 
            return true;
        return false;
    }

    public static int height(Node root) {
        if(root == null)
            return 0;
        return (1 + Math.max(height(root.left), height(root.right)));
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