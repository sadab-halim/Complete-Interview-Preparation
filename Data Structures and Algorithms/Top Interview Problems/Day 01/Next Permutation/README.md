## Next Permutation
Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

```
Example 1 :

Input format: Arr[] = {1,3,2}
Output: Arr[] = {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.

Example 2:

Input format: Arr[] = {3,2,1}
Output: Arr[] = {1,2,3}
Explanation: As we see all permutations of {1,2,3}, we find {3,2,1} at the last position. So, we have to return the topmost permutation.
```

### Solution - 1 (Brute Force)
**Approach:** <br/>
1. Find all possible permutations of elements present and store them.
2. Search input from all possible permutations.
3. Print the next permutation present right after it.

**Time Complexity:** O(n! * n) <br/>
**Space Complexity:** O(1)

### Solution - 2
