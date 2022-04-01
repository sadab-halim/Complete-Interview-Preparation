class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

class Main {
    // Function to check if subtree rooted at 'a' and 'b' mirror of each other
    public static boolean isMirror(Node a, Node b) {
        if (a == null && b == null)
            return true;
        if (a != null && b != null)
            return isMirror(a.left, b.right) && isMirror(a.right, b.left);
        return false;
    }

    // ---------------------- T.C: O(n), A.S: O(h) -------------------- 
    // Function to check if the given binary tree is symmetric or not
    public static boolean isSymmetric (Node root) {
        if (root == null)
            return true;
        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        /* Construct the following tree
              1
            /   \
           /     \
          2       3
           \     /
            5   6
        */
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
 
        if (isSymmetric(root)) {
            System.out.print("The binary tree is symmetric");
        }
        else {
            System.out.print("The binary tree is not symmetric");
        }
    }
}