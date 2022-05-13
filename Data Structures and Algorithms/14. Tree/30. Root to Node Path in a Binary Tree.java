/* ------- T.C: O(N), A.S: O(N) ------- */
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
    public static boolean getPath(Node root, ArrayList<Integer> arr, int x) {
        if(root == null)
            return false;
        // push the node's value in arr
        arr.add(root.data);

        // if it is the required node, return true
        if(root.data == x)
            return true;
        
        // else check whether the required node lies in the
        // left subtree or right subtree os the current node
        if(getPath(root.left, arr, x) || getPath(root.right, arr, x))
            return true;
        
        // required node does not lie in either in the left or right
        // subtree of the current node.

        // thus, remove current node's value from 'arr'
        // and then return false
        arr.remove(arr.size() - 1);
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(60);
        root.left.right.right = new Node(70);

        ArrayList<Integer> arr = new ArrayList<>();
        
        boolean res;
        res = getPath(root, arr, 7);

        System.out.print("The path is: ");
        for(int it: arr) {
            System.out.print(it + " ");
        }
    }
}