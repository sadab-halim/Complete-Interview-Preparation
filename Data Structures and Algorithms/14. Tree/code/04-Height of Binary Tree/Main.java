class Node {
    int key;
    Node left = null;
    Node right = null;
    Node (int key) {
        this.key = key;
    }
}

class Main {
    // ---------------- T.C: O(n), A.S: O(h) --------------
    // Function to calculate the height of a given binary tree
    public static int height (Node root) {
        if (root == null)
            return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        
        // recursive fn call for the left and right subtree and consider max depth
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        System.out.println("The height of the binary tree is: " + height(root));
    }
}