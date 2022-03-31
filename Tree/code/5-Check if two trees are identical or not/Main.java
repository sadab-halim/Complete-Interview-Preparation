class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

class Main {
    // ----------------- T.C: O(n), A.S: O(h) ------------------
    // Function to check if two trees are identical
    public static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 != null && root2 != null)
            return (root1.key == root2.key && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
        return false;
    }

    public static void main(String[] args) {
        // construct the first tree
        Node root1 = new Node(15);
        root1.left = new Node(10);
        root1.right = new Node(20);
        root1.left.left = new Node(8);
        root1.left.right = new Node(12);
        root1.right.left = new Node(16);
        root1.right.right = new Node(25);
 
        // construct the second tree
        Node root2 = new Node(15);
        root2.left = new Node(10);
        root2.right = new Node(20);
        root2.left.left = new Node(8);
        root2.left.right = new Node(12);
        root2.right.left = new Node(16);
        root2.right.right = new Node(25);

        if(isIdentical(root1, root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Both trees are not Identical");
    }
}