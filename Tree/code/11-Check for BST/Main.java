class Node {
    int data;
    Node left = null, right = null;
    Node(int data) {
        this.data = data;
    }
}

class Main {
    public static void main(String[] args) {
        int[] keys = {15, 10, 20, 8, 12, 16, 25};

        Node root = null;
        for(int key: keys) {
            root = insert(root, key);
        }

        
    }
}