## Peak Element

Given an array of integers. Find a peak element in it. An array element is a peak if it is NOT smaller than its neighbours. For corner elements, we need to consider only one neighbour. 

*Example-1* <br/>
```
Input: array[]= {5, 10, 20, 15}
Output: 20
The element 20 has neighbours 10 and 15,
both of them are less than 20.
```

*Example-2*
```
Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
The element 20 has neighbours 10 and 15, 
both of them are less than 20, similarly 90 has neighbours 23 and 67.
```

*Following corner cases give better idea about the problem:* 

- If input array is sorted in strictly increasing order, the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
- If the input array is sorted in strictly decreasing order, the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
- If all elements of input array are same, every element is a peak element.