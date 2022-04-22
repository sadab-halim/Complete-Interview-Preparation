# Insertion Sort
Insertion Sort is one of the simplest sorting techniques which you have used in your daily lives while arranging a deck of cards.

### How Insertion Sort algorithm work?

## Insertion Sort Algorithm
**Pseudocode** <br/>
```java
insertionSort(array)
    mark First element as sorted
    for each unsorted element E
        'extract' the element E
        for j <- lastSortedIndex down to 0
            if current element j > E
                move sorted element to the right by 1
        break loop and insert E here
end InsertionSort
```

**Explanation** <br/>
`Line 2` We don't process the first element, as it has nothing to compare against <br/>
`Line 3` Loop from i = 1 till the end, to process each element <br/>
`Line 4` Extract the element at position i i.e. array[i]. Let it called be E <br/>
`Line 5` To compare E with its left elements, loop j from i - 1 to 0 <br/>
`Line 6,7` Compare E with the left element, if E is lesser, then move array[j] to right by 1 <br/>
`Line 8` Once we have found the position for E, place it here <br/>

**Code** <br/>
```java
public static void insertionSort(int arr[]) {
    int n = arr.length;
    for(int i = 1; i< n; i++) {
        int currentElement = arr[i];
        int j = i - 1;

        while(j >= 0 && arr[j] > currentElement) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = currentElement;
    }
}
```

### Complexity Analysis
1. **Time Complexity**
    - **Worst Case:** O(n^2)
    - **Average Case:** Theta(n^2)
    - **Best Case:** Omega(n)

2. **Space Complexity:** O(1)