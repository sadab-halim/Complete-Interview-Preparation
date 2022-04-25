class Node {
    int data;
    Node left;
    Node right;

    // Function to create a new binary tree node having a given key
    Node (int key) {
        data = key;
        left = right = null;
    }
}

class Recursive_Approach {
    // ---------------- T.C: O(n), A.S: O(n) ----------------
    // Recursive function to perform preorder traversal
    public static void preorder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        /* Construct the following tree
                      1
                    /  \
                  /     \
                2        3
               /       /  \
              /       /    \
             4       5      6
                    / \
                  /    \
                7       8
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        preorder(root);
    }
}
