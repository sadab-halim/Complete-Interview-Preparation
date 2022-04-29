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

**Code** <br/>
```java
class MergeSort {m int 
    public static void merge(int arr[], int start, int mid, int end) {
        int m1 = mid - start + 1;
        int m2 = end - mid;

        int temp1[] = new int[m1];
        int temp2[] = new int[m2];

        for(int i = 0; i < m1; i++)
            temp1[i] = arr[start + i];
        for(int j = 0; j < m2; j++)
            temp2[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = start;

        while(i < m1 && j < m2) {
            if(temp1[i] <= temp2[j]) {
                arr[k] = temp1[i];
                i++;
            } else {
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }

        while (i < m1) {
            arr[k] = temp1[i];
            i++;
            k++;
        }

        while (j < m2) {
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            // merge the arr subarrays
            merge(arr, start, mid, end);
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


