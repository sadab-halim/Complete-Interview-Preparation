class Node {
    int key;
    Node left = null, right = null;
    Node(int key) {
        this.key = key;
    }
}

class Main {
    /* ------------------ T.C: O(n), A.S: O(h) --------------------- */
    public static int hasChildrenSumProperty(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return root.key;
        int left = hasChildrenSumProperty(root.left);
        int right = hasChildrenSumProperty(root.right);

        // if the root's value is equal to the sum of values at its left
        // and right subtree
        if (left != Integer.MIN_VALUE && right != Integer.MIN_VALUE && root.key == left + right)
            return root.key;
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        /* Construct the following binary tree
                  25
                /    \
               /      \
              /        \
             12        13
            /  \      /  \
           /    \    /    \
          7      5  6      7
        */

        Node root = new Node(25);
        root.left = new Node(12);
        root.right = new Node(13);
        root.left.left = new Node(7);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        if(hasChildrenSumProperty(root) != Integer.MIN_VALUE)
            System.out.println("Binary tree holds children-sum property.");
        else
            System.out.println("Binary tree does not hold children sum property.");
    }
}