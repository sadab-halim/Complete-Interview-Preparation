# Height of Binary Tree

Problem Statement: Find the Maximum Depth of Binary Tree. 

**Maximum Depth** is the count of nodes of the longest path from the root node to the leaf node.

## Solution 1
**Intuition + Approach:** Using Level Order Traversal

The depth of the Binary Tree is the number of levels in the binary tree. So, if we simply do a level order traversal on the binary tree and keep a count of the number of levels, it will be our answer.

```
T.C: O(N)
A.S: O(N) (Queue data structure is used) 
```
## Solution 2
**Intuition: Recursively (Post Order Traversal)** <br/>
To calculate the Maximum Depth, we can simply take the maximum of the depths of the left and right subtree and add 1 to it.

*Why take Maximum??* <br/>
Because we need maximum depth so if we know left & right children’s maximum depth then we’ll definitely get to the maximum depth of the entire tree.

**Approach:**
- We start to travel recursively and do our work in Post Order.
- Reason behind using Post Order comes from our intuition , that if we know the result of  left and right child then we can calculate the result using that. 
- So for every node post order, we do Max( left result , right result ) + 1 and return it to the previous call.
Base Case is when root == null so we need to return 0;

```
T.C: O(N)
A.S: O(H)

where 'H' is the height of the binary tree
````