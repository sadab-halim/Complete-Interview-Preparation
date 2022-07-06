ListNode* reverse_list(ListNode* head){
    ListNode *new_head = NULL;
    while(head != NULL){
        ListNode *next = head -> next;
        head->next = new_head;
        new_head = head;
        head = next;
    }
    return new_head;
}