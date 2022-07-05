Node *delHead(Node *head){
    if(head == NULL)
        return NULL;
    else{
        Node *temp = head -> next;
        delete(head);
        return temp;
    }
}
