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
    public static ArrayList<Integer> inOrderTrav(Node root) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        Stack <Node> s = new Stack<>();

        while(true) {
            if(root != null){
                s.push(root);
                root = root.left;
            } else {
                if(s.isEmpty())
                    break;
                root = s.peek();
                inOrder.add(root.data);
                s.pop();
                root = root.right;
            }
        }
        return inOrder;
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
        root.right.right.right = new Node(100);

        ArrayList<Integer> inOrder;
        inOrder = inOrderTrav(root);

        System.out.print("The inOrder Traversal is: ");
        for(int i = 0; i < inOrder.size(); i++)
            System.out.print(inOrder.get(i) + " ");
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
    public static void inOrderTrav(Node curr, ArrayList<Integer>inOrder) {
        if(root == null)
            return;
        inOrderTrav(root.left, inOrder);
        inOrder.add(root.data);
        inOrderTrav(root.right, inOrder);
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
        root.right.right.right = new Node(100);
    }

    ArrayList<Integer> inOrder = new ArrayList<>();
    inOrderTrav(root, inOrder);

    System.out.println("The inOrder Traversal is: ");
    for(int i = 0; i < inOrder.size(); i++)
        System.out.print(inOrder.get(i) + " ");
}