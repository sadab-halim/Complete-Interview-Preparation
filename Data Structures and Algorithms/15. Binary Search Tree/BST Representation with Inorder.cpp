// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

class BST{
    int data;
    BST *left, *right;
public:
    BST(); //default constructor
    BST(int); //paramaterized constructor
    BST *insert(BST*, int); //Insert function
    void inorder(BST*); //Inorder Traversal
};

//default constructor definition
BST::BST(){ }

//parameterized constructor definition
BST::BST(int value){
    data = value;
    left = right = NULL;
}

//insert function definition
BST *BST::insert(BST* root, int value){
    if(!root)
        return new BST(value);
    //insert data
    if(root->data < value)
        root->right = insert(root->right, value);
    else
        root->left = insert(root->left, value);
    return root;
}

//inorder traversal
void BST::inorder(BST* root){
    if(!root) return;
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}

int main() {
    BST b, *root = NULL;
    root = b.insert(root, 50);
    b.insert(root, 30);
    b.insert(root, 20);
    b.insert(root, 40);
    b.insert(root, 70);
    b.insert(root, 80);
    b.insert(root, 60);
    
    b.inorder(root);
    return 0;
}