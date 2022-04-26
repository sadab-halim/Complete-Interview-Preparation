/* Hoare's Partition works by initializing two indexes that start at two ends, the two indexes move toward each other until an inversion is found. When an inversion is found, two values are swapped and the process is repeated.*/

/* 
----- ALGORITHM -----
pivot = arr[lo]
   i = lo - 1  

   do
      i = i + 1
   while arr[i] < pivot

   do
      j--;
   while (arr[j] > pivot);

   if i >= j then 
      return j
   swap arr[i] with arr[j]
*/

public static int partition(int arr[], int low, int high) {
    int pivot = arr[low];
    int i = low - 1, j = high + 1;

    while(true) {
        do {
            i++;
        } while (arr[i] < pivot);

        do {
            j--;
        } while(arr[j] > pivot);

        if(i >= j)
            return j;
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}