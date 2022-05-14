/* ----- ITERATIVE IMPLEMENTATION, T.C: O(N), A.S: O(N) ----- */
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
    static ArrayList <Integer> preOrderTrav(Node root) {
        ArrayList<Integer>preOrder = new ArrayList<Integer>();
        if (root == null)
            return preOrder;

        Stack<Node>s = new Stack<>();
        s.push(root);

        while (!s.isEmpty()) {
            Node topNode = s.peek();
            preOrder.add(topNode.data);
            s.pop();
            if (topNode.right != null)
                s.push(topNode.right);
            if (topNode.left != null)
                s.push(topNode.left);
        }
        return preOrder;
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(80);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.right.right.left = new Node(90);
        root.right.right.right = new Node(100);

        ArrayList<Integer>preOrder = new ArrayList<>();
        preOrder = preOrderTrav(root);

        System.out.print("The preOrder Traversal is : ");
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + " ");
        }

    }
}


/* ----- RECURSIVE IMPLEMENTATION, T.C: O(N), A.S: O(N) ----- */
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
    public static void preOrderTrav(Node root, ArrayList<Integer> preorder){
        if(root == null)
            return;
        preorder.add(root.data);
        preorder(root.left, preorder);
        preorder(root.right, preorder;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);
        root.right.left.left = new Node(70);
        root.right.left.right = new Node(80);

        ArrayList<Integer> preorder = new ArrayList<>();
        preOrderTrav(root, preorder);

        System.out.println("The Preorder Traversal is: ");
        for(int i = 0; i < preorder.size(); i++)
            System.out.print(preorder.get(i) + " ");
    }
}