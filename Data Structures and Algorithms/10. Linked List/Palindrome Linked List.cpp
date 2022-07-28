#include<bits/stdc++.h>
using namespace std;

class Node{
public:
    int data;
    Node *next;
    Node(int x){
        data = x;
        next = NULL;
    }
};

void insertNode(Node *head, int x){
    Node *newNode = new Node(x);
    if(head == NULL){
        head = newNode;
        return;
    }
    Node *temp = head;
    while(temp->next != NULL)
        temp = temp->next;
    temp->next = newNode;
}

bool isPalindrome(Node *head){
    vector<int> arr;
    while(head != NULL){
        arr.push_back(head->data);
        head = head->next;
    }
    for(int i = 0; i < arr.size()/2; i++)
        if(arr[i] != arr[arr.size() - i - 1]) return false;
    return true;
}


Node *reverse(Node *ptr){
    Node *prev = NULL;
    Node *next = NULL;
    while(ptr != NULL){
        next = ptr->next;
        ptr->next = prev;
        prev = ptr;
        ptr = next;
    }
    return prev;
}

bool isPalindromeEff(Node *head){
    if(head == NULL || head->next == NULL) return true;
    Node *slow = head;
    Node *fast = head;

    while(fast->next != NULL && fast->next->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }

    slow->next = reverse(slow->next);
    slow = slow->next;
    Node *dummy = head;

    while(slow != NULL){
        if(dummy->data != slow->data) return false;
        dummy = dummy->next;
        slow = slow->next;
    }
    return true;
}

int main(){
    Node *head = NULL;
    insertNode(head, 1);
    insertNode(head, 2);
    insertNode(head, 3);
    insertNode(head, 2);
    insertNode(head, 1);
    isPalindrome(head) ? cout<<"True" : cout<<"False";
    cout<<endl;
    isPalindromeEff(head) ? cout<<"True" : cout<<"False";
    return 0;
}