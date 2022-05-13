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
    public static postOrderTrav(Node root, ArrayList<Integer> postOrder) {
        if(root == null)
            return;
        postOrderTrav(root.left, postOrder);
        postOrderTrav(root.right, postOrder);
        postOrderTrav(root.data);
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

        ArrayList<Integer> postOrder = new ArrayList<>();
        postOrderTrav(root, postOrder);

        System.out.println("The postOrder Traversal is: ");
        for(int i = 0; i < postOrder.size(); i++){
            System.out.print(postOrder.get(i) + " ");
        }
    }
}