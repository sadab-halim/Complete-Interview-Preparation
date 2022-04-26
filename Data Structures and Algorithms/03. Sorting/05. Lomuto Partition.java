/* Lomuto Partition: In this partition, the last element chooses as a pivot in this partition. */

/* 
----- ALGORITHM -----
pivot = arr[high]
i = low
for j:= low to high - 1 do
    if arr[j] <= pivot then
        swap arr[i] with arr[j]
        i = i + 1
swap arr[i] with arr[high]
return i
*/

// function of lomuto partition
public static int partition(int arr[]){
    int pivot = arr[high];
    int index = low - 1;

    for(int i = low; i < high; i++) {
        if(arr[i] < pivot) {
            index++;
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    int pivotPos = ++index;

    temp = arr[index] 
    arr[index] = pivot;
    arr[high] = temp;

    return pivotPos;
}