# Heap Sort
Heap sort is an in-place (an algorithm where no extra memory space is needed, and the sorting is done using the available place) comparison-based sorting algorithm. 

Heap sort, as the name suggests, makes use of heap data structure to sort the given array. 
It is one of the most preferred sorting algorithms due to its favorable worst-case time complexity.

Similar to Selection Sort, Heap Sort also divides the given array into two regions –
- Sorted region – built on the right side of the list/array
- Unsorted region – the rest of the unsorted list/array

![SortingEx9](../../../Images/sorting9.png)

Initially, the sorted region is left empty, and we only have the unsorted region in the array. The largest element from the unsorted region is picked iteratively and added to the sorted region.

The elements in the unsorted region of the array are visualized by using a unique type of complete binary tree known as a heap.

Heap sort differs from the selection sort in a way that heap sort does not go through the unsorted region linearly, instead, it arranges the unsorted region in a heap data structure that helps in finding the desired element quickly & efficiently.

## What is Heap Data Structure?
A heap is a special type of binary tree that follows the following conditions –

The given binary tree should be a complete binary tree.
It should satisfy the heap property. It means that all the children of a given node must be greater than the parent node, or all the children must be smaller than the parent node.

If all the nodes (including the root) are greater than their child nodes, it is known as a **max-heap**. <br/>
If all the nodes (including the root) are smaller than their child nodes, it is known as a **min-heap**.

### How Does Heap Sort Algorithm Work?
- For the given set of elements, create a max-heap
- Heapify the binary tree using the elements in the unsorted region of the array.

**Heapify** is the process of rearranging the elements to form a tree that maintains the properties of a heap.

- Heapifying helps us in maintaining the property that every node should have greater value than its children nodes. 

- Once the heap is formed, delete the root element from the heap, and add this element in the sorted region of the array. Here, since we are removing the root element from a max-heap, we will obtain the largest element from the unsorted region each time an element is removed

- Repeat the steps 2 & 3 until all the elements from the unsorted region are added to the sorted region.

### How to Heapify a Binary Tree?
**Heapify** is the process of rearranging the elements to form a tree that maintains the properties of the heap data structure.

After inserting the elements into a heap, they may or may not satisfy the heap properties. In that case, we need to rearrange the locations of the elements in the erroneous heap to make it a heap again

1. Visualize all the elements of the list as a complex binary tree
2. Start by comparing the values of children nodes with that of the parent. If the value of the parent is smaller than the values of the children, swap it. Swapping is done with a larger of two children. This process is repeated until every node satisfy the properties of a max-heap

**Point to Remember:** A node can be heapified if all the children nodes are already heapified. This is the reason why we start from the bottom-most sub-tree.

**Code** <br/>
```java
class HeapSort {
    public void heapSort(int arr[]) {
        int n = arr.length;
        // building a max-heap for each iteration of the loop
        for(int i = n/2 - 1; i>= 0; i--) {
            heapify(arr, n, i);
        }
        // heap sort
        for(int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // heapify root element recursively
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int index) {
        // finding the left and right child
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // setting the largest out of root, left child and right child
        if(left < n && arr[left] > arr[largest])
            largest = left;
        
        if(right < n && arr[right] > arr[largest])
            largest = right;
        // if index is not equal to largest
        if(largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            // calling the heapify function recursively
            heapify(arr, n, largest);
        }
    }
}
```

### Complexity Analysis
1. **Time Complexity**
    - **Worst Case:** O(nlogn)
    - **Average Case:** Theta(nlogn)
    - **Best Case:** Omega(n)
    
2. **Space Complexity:** O(1)