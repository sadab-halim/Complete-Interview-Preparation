class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

class Main {

    public static void preorder(Node root) {
        if(root == null)
            return;
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void swap (Node root) {
        if(root == null) 
            return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void convertToMirror(Node root) {
        if (root == null)
            return;
        convertToMirror(root.left);
        convertToMirror(root.right);

        swap(root);
    }

    
    public static void main(String[] args) {
        /* Construct the following tree
                  1
                /   \
               /     \
              2       3
             / \     / \
            4   5   6   7
        */
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        convertToMirror(root);
        preorder(root);
    }
}