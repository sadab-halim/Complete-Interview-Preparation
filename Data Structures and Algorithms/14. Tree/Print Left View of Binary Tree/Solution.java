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
    public static List<Integer> leftSideView(Node root) {
        List<Integer> res = new ArrayList<>();
        leftView(root, res, 0);
        return res;
    }

    public static void leftView(Node root, List<Integer> res, int currDepth) {
        if(root == null)
            return;
        if(currDepth == result.size())
            res.add(root.val);
        leftView(root.left, res, currDepth + 1);
        leftView(root.right, res, currDepth + 1);
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
        root.right.right.left = new Node(90);

        System.out.println(leftSideView(root));
    }
}