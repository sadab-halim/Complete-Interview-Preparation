#include<iostream>
using namespace std;

class Node{
public:
    int data;
    Node* left;
    Node* right;
};

Node* newNode(int val){
    Node *temp = new Node();
    temp->left = NULL;
    temp->right = NULL;
    temp->data = val;
    return temp;
}

Node *insert(Node* root, int val){
    if(!root) return newNode(val);
    if(root->data < val)
        root->right = insert(root->right, val);
    else
        root->left = insert(root->left, val);
    return root;
}

int ceilInBST(Node *root, int val){
    int ceil = -1;
    while(root){
        if(root->data == val){
            ceil = root->data;
            return ceil;
        }
        if(root->data < val){
            root = root->right;
        } else {
            ceil = root->data;
            root = root->left;
        }
    }
    return ceil;
}

int main(){
    Node* root = NULL;
    root = insert(root, 8);
    insert(root, 4);
    insert(root, 12);
    insert(root, 2);
    insert(root, 2); 
    insert(root, 6); 
    insert(root, 10); 
    insert(root, 14); 
    
    cout<<ceilInBST(root, 9);
    return 0;
}