Node *delHead(Node *head){
    if(head == NULL)
        return NULL;
    else{
        Node *temp = head;
        head = head->next;
        delete(temp);
        return head;
    }
}
