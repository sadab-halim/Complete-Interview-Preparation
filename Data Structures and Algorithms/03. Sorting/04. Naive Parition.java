/* Naive Parition helps to maintain the relative order of the elements but this partition takes O(n) extra space. */

/* 
----- ALGORITHM -----
1. Make a temporary array temp[r-l+1] length
2. Choose last element as a pivot element
3. Run two loops:
   - Store all elements in the temp array that are less than pivot element
   - Store the pivot element
   - Store all the elements in the temp array that are greater than pivot element.
4. Update all the elements of arr[] with the temp[] array 
*/

//  function of naive partition
public static int partition(int arr[], int low, int high) {
    int temp[] = new int[(high - low) + 1];

    int pivot = arr[high];
    int index = 0;

    for(int i = low; i <= high; i++) {
        if(arr[i] < pivot) 
            temp[index++] = arr[i];
    }

    int pos = index;
    // placing the pivot to its original position
    temp[index++] = pivot;

    for(int i = low; i <= high; i++) {
        if(arr[i] > pivot)
            temp[index++] = arr[i];
    }

    // change the original array
    for(int i = low; i <= high; i++)
        arr[i] = temp[i - low];
    return pos;
}