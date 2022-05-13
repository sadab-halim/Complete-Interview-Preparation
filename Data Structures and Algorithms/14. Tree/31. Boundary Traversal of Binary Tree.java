/* -------- T.C: O(N), A.S: O(N) -------- */

import java.util.*;

import javax.sound.sampled.DataLine;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {
    public static Boolean isLeaf(Node root) {
        return(root.left == null) && (root.right == null);
    }

    public static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.left;
        while(curr != null){
            if(isLeaf(curr) == false)
                res.add(curr.data);
            if(curr.left != null)
                curr = curr.left;
            else    
                curr = curr.right;
        }
    }

    public static void addRightBoundary(Node root, ArrayList < Integer > res) {
        Node cur = root.right;
        ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    public static void addLeaves(Node root, ArrayList < Integer > res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }
    public static ArrayList < Integer > printBoundary(Node node) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (isLeaf(node) == false) ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(60);
        root.left.right.right = new Node(70);

        ArrayList<Integer> boundaryTraversal;
        boundaryTraversal = printBoundary(root);

        System.out.println("The Boundary Traversal is: ");
        for(int i = 0; i < boundaryTraversal.size(); i++)
            System.out.print(boundaryTraversal.get(i) + " ");
    }
}