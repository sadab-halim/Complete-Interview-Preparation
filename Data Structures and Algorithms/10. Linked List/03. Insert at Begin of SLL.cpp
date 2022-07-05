struct Node{
    int data;
    Node *next;
    Node(int x){
        data = x;
        next = NULL; 
    }
};

Node *insertAtBeg(Node *head, int x){
    Node *temp=new Node(x);
    temp->next=head;
    return temp;
}

void printList(Node *head){
    Node *curr = head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr=curr->next;
    }
}

int main(){
    Node *head = NULL;
    head = insertAtBeg(head, 30);
    head = insertAtBeg(head, 20);
    head = insertAtBeg(head, 10);
    printList(head);
    return 0;
}
