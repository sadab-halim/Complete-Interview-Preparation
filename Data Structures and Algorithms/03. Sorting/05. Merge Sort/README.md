# Merge Sort
Merge Sort works by diving the array repeatedly to make several single-element arrays.

Merge Sort uses the Divide and Conquer algorithm where a problem is solved by dividing it into numerous sub-problems, conquering each of the sub-problems individually and then combining it to form the end result.

![SortingExample6](../../../Images/sorting6.png)

### How Does the Merge Sort Algorithm Work?
1. **Divide:** In this step, we find the midpoint of the given array by using the formula mid=start+(end-start)/2

2. **Conquer:** In this step, we divide the array into subarrays using the midpoint calculated. We recursively keep dividing the array and keep calculating the midpoint for doing the same.

a single array element is always sorted. So, our aim is to continuously divide until all elements in the array are single array elements. Once that is done, the array elements are combined back to form a sorted array.

![SortingExample7](../../../Images/sorting7.png)

3. **Combine:**
Now that all our subarrays are formed, it is now time to combine them in a sorted order.

![SortingEx8](../../../Images/sorting8.png)

**Pseudocode** <br/>
```java
PROCEDURE function mergeSort
    FOR each element present in the original arra indexed by j
        if (j <= 1) return arr
        var left = arr[0] to arr[j/2]
        var right = arr[j/2 + 1] to arr[j]
        left = mergeSort(left)
        right = mergeSort(right)
        return merge(left, right)
    END FOR
END PROCEDURE

PROCEDURE function mergeSort
    WHILE length(left) > 0 and length(right) > 0
        if first(left) > first(right)
            append first(left) to ans
            left = rest(left)
        else
            append first(right) to ans
            right = rest(right)
    IF length(left) > 0
        insert left in ans
    END IF

    IF length(right) > 0
        insert right in ans
    END IF
    return result
END PROCEDURE 
```

**Code** <br/>
```java
class MergeSort {m int 
    public static void merge(int sorted[], int start, int mid, int end) {
        int m1 = mid - start + 1;
        int m2 = end - mid;

        int arr1[] = new int[m1];
        int arr1[] = new int[m2];

        for(int i = 0; i < m1; i++)
            arr1[i] = sorted[start + i];
        for(int j = 0; j < m2; j++)
            arr2[j] = sorted[mid + 1 + j];
        
        int i = 0, j = 0, k = start;

        while(i < m1 && j < m2) {
            if(arr1[i] <= arr2[j]) {
                sorted[k] = arr1[i];
                i++;
            } else {
                sorted[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m1) {
            sorted[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m2) {
            sorted[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int sorted[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(sorted, start, mid);
            mergeSort(sorted, mid + 1, end);
            // merge the sorted subarrays
            merge(sorted, start, mid, end);
        }
    }
}
```

### Complexity Analysis
1. **Time Complexity**
    - **Worst Case:** O(nlog(n))
    - **Average Case:** Theta(nlog(n))
    - **Best Case:** Omega(nlog(n))

2. **Space Complexity:** O(n)


