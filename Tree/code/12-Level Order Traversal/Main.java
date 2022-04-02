import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    int key;
    Node left = null, right = null;
    Node(int key) {
        this.key = key;
    }
}

class Main {
    /* ------------------ Naive Method, T.C: O(n^2), A.S: O(h) ------------------- */
    public static void levelOrderTraversalNaive(Node root) {
        int level = 1;
        while(printLevel(root, level)) {
            level++;
        }
    }

    public static boolean printLevel(Node root, int level) {
        if (root == null) {
            return false;
        }
        if (level == 1) {
            System.out.print(root.key + " ");
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
    }

    /* ------------------------------ Efficient Method, T.C: O(n), A.S: O(h) -------------------- */
    public static void levelOrderTraversalEfficient (Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        Node curr;
        while(!queue.isEmpty()) {
            curr = queue.poll();
            System.out.print(curr.key + " ");

            if(curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        levelOrderTraversalNaive(root);
        levelOrderTraversalEfficient(root);
    }
}