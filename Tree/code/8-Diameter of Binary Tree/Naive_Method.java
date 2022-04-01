class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

class Naive_Method {
    /* ------------------ T.C: O(n^2), A.S: O(h) ------------------ */
    public static int getDepth(Node root) {
        if(root == null)
            return 0;
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static int getDiameter(Node root) {
        if(root == null)
            return 0;
        int leftDiameter = getDepth(root.left);
        int rightDiameter = getDepth(root.right);
        int diameter = getDepth(root.left) + getDepth(root.right);
        diameter = Math.max(diameter, Math.max(leftDiameter, rightDiameter));
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