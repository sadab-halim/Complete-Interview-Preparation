/*--------- BRUTE FORCE APPROACH, T.C: O(n) ---------*/
/*
We can traverse through the Linked List while maintaining a count of nodes, 
let’s say in the variable count, and then traversing for the 2nd time for (n – count) nodes to get to the nth node of the list.
*/

/*--------- OPTIMAL APPROACH, T.C: O(n) ---------*/
Node* remove_Nth_From_End(Node* head, int n){
    Node* start = new Node();
    Node* fast = start;
    Node* slow = start;

    for(int i = 1; i <= n; i++){
        fast = fast -> next;
    }

    while(fast->next != NULL){
        fast = fast->next;
        slow = slow->next;
    }
    slow->next = slow->next->next;
    return start->next;
}