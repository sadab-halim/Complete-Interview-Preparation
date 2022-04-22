# Sorting
A sorting algorithm is a method of reorganizing the elements in a meaningful order.

### What is in-place sorting?
An in-place sorting algorithm uses constant space for producing the output (modifies the given array only). It sorts the list only by modifying the order of the elements within the list.

Insertion Sort and Selection Sorts are in-place sorting algorithms

### Stability in sorting algorithms

### Time Complexities of all Sorting Algorithms
The efficient of an algorithm depends on two parameters:
- Time Complexity
- Space Complexity

**Time Complexity:** is defined as the number of times a particular instruction set is executed rather than the total time is taken. It is because the total time taken also depends on some external factors like the compiler used, processor’s speed, etc.

**Space Complexity:** is the total memory space required by the program for its execution.

**Point to Remember:** In spite of these parameters the efficiency of an algorithm also depends upon the nature and size of the input.

### Sorting Algorithms and their Time Complexities

| Algorithm | Worst | Average | Best |
| --------- | ---- | ------- | ----- |
| Bubble Sort | O(n^2) | Theta(n^2) | Omega(n) |
| Selection Sort | O(n^2) | Theta(n^2) | Omega(n^2) |
| Insertion Sort | O(n^2) | Theta(n^2) | Omega(n) |
| Quick Sort | O(n^2) | Theta(nlog(n)) | Omega(nlog(n)) |
| Merge Sort | O(nlogn(n)) | Theta(nlog(n)) | Omega(nlogn(n)) |
| Heap Sort | O(nlog(n)) | Theta(nlog(n)) | Omega(nlog(n)) | 
| Bucket Sort | O(n^2) | Theta(n+k) | Omega(n+k) |
| Radix Sort | O(nk) | Theta(nk) | Omega(nk) |
| Count Sort | O(n+k) | Theta(n+k) | Omega(n+k) |


