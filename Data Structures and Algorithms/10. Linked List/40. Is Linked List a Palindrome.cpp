/* ------------ IS LINKED LIST A PALINDROME ------------*/

#include<bits/stdc++.h>
using namespace std;

class Node{
    public:
        int num;
        Node* next;
        Node(int val){
            num = val;
            next = NULL;
        }
};

// function for inserting nodes
void insertNode(Node* head, int val){
    Node* newNode = new Node(val);
    if(head == NULL){
        head = newNode;
        return;
    }
    Node* temp = head;
    while(temp->next != NULL)
        temp = temp->next;
    temp->next = newNode;
    return;
}

// reverse function
Node* reverse(Node* head){
    Node* p = NULL;
    Node* c = head;
    Node* n = head->next;
    
    while(c != NULL){
        c->next = p;
        p = c;
        c = n;
        if(n != NULL) n = n->next;
    }
    return p;
}

/* ---------- BRUTE FORCE APPROACH, T.C: O(N), S.C: O(N) ---------- */
bool isPalindromeBrute(Node* head) {
    vector<int> arr;
    while(head != NULL) {
        arr.push_back(head->num);
        head = head->next;
    }
    for(int i=0;i<arr.size()/2;i++) 
        if(arr[i] != arr[arr.size()-i-1]) return false;
    return true;
}

/* ---------- Otimal APPROACH, T.C: O(N/2), S.C: O(1) ---------- */
// check for palindrome 
bool isPalindromeOptimal(Node* head){
    if(head == NULL || head->next == NULL)
        return true;
    Node* slow = head;
    Node* fast = head;
    
    while(fast->next != NULL && fast->next->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }
    // now reverse
    slow->next = reverse(slow->next);
    slow = slow->next;
    Node* dummy = head;
    
    while(slow != NULL){
        if(dummy->num != slow->num)
            return false;
        dummy = dummy->next;
        slow=slow->next;
    }
    return true;
}
int main(){
    Node* head = NULL;
    insertNode(head, 1);
    insertNode(head, 2);
    insertNode(head, 3);
    insertNode(head, 2);
    insertNode(head, 1);
    // brute force approach function call
    isPalindromeBrute(head) ? cout<<"True" : cout<<"False";
    // optimal approach function call
    isPalindromeOptimal(head) ? cout<<"True" : cout<<"False";
    return 0;
}