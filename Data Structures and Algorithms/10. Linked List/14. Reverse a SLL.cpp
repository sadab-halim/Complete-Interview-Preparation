#include<iostream>
using namespace std;

struct Node{
    int data;
    Node *next;
    Node(int x){
        data = x;
        next = NULL;
    }
};

Node *insert(Node *head, int x){
    Node *newNode = new Node(x);
    if(head == NULL) return newNode;

    Node *curr = head;
    while(curr->next != NULL){
        curr = curr->next;
    }
    curr->next = newNode;
    newNode->next = NULL;
    return head;
}

Node *reverseList(Node *head){
    Node *curr = head;
    Node *prev = NULL;
    while(curr != NULL){
        Node *forward = curr->next;
        curr->next = prev;
        prev = curr;
        curr = forward;
    }
    return prev;
}

void printList(Node *head){
    Node *curr = head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr = curr->next;
    }
}

int main(){
    Node *head = NULL;
    head = insert(head, 10);
    head = insert(head, 20);
    head = insert(head, 30);
    head = insert(head, 40);
    
    cout<<"List before reversing: ";
    printList(head);
    head = reverseList(head);
    cout<<"\nList after reversing: ";
    printList(head);
    return 0;
}