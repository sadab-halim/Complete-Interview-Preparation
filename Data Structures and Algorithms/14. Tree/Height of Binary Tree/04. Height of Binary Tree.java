/* --------- NAIVE METHOD --------- */
/* --------- T.C: O(N), A.S: O(N) --------- */
import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {
    public static int levelOrder(Node root) {
        if(root == null)    
            return 0;
        
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);

        int level = 0;
        while(queue.size() > 0) {
            int size = queue.size();

            while(size-- > 0) {
                Node remNode = queue.removeFirst();
                if(remNode.left != null)
                    queue.addLast(remNode.left);
                if(remNode.right != null)
                    queue.addLast(remNode.right);
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(80);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        int res = levelOrder(root);
        System.out.println(res);
    }
}

/* --------- EFFICIENT METHOD --------- */
/* --------- T.C: O(N), A.S: O(H) --------- */
import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {
    public static int maxDepth(Node root) {
        if(root == null)
            return 0;
        
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(80);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        int res = maxDepth(root);
        System.out.println(res);
    }
}