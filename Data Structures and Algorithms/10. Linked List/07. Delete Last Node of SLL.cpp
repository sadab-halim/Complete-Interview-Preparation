Node *delTail(Node *head){
    if(head == NULL)
        return NULL;
    if(head -> next == NULL){
        delete head;
        return NULL;
    }
    Node *curr = head;
    while(curr -> next -> next != NULL)
        curr = curr -> next;
    delete(curr -> next);
    curr -> next = NULL;
    return head;
}
