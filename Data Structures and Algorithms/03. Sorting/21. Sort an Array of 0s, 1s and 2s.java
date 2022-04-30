/*Given an array consisting of only Os, 1s and 2s. Write a program to in-place sort the
array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space) */

/*
Example:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: nums = [0]
*/

/* ----------- METHOD - 1, T.C: O(nlogn), A.S: O(1) ----------- */
/* Sorting, since the array contains only 3 integers, 0, 1, and 2. 
   Simply sorting the array would arrange the elements in increasing order. 
*/


/* ----------- METHOD - 2, T.C: O(n), A.S: O(1) ----------- */
/* Keeping count of values: Since in this case there are only 3 distinct values in the array 
so it's easy to maintain the count of all, Like the count of 0, 1, and 2. 
This can be followed by overwriting the array based on the
frequency(count) of the values.

APPROACH:
1. Take 3 variables to maintain the count of 0, 1 and 2.
2. Travel the array once and increment the corresponding counting variables
*/


/* ----------- METHOD - 3, T.C: O(n), A.S: O(1) ----------- */
/* Variation of "Dutch National Flag Algorithm"
   In this approach, we will be using 3 pointers named low, mid, and high. We will be using these 3 pointers to move around the values. 
   The primary goal here is to move 0s to the left and 2s to the right of the array and at the same time all the 1s shall be in the middle region of the array 
   and hence the array will be sorted. 
*/

class Main {
    public static void sortColors(int nums[]) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp;

        while(mid <= high) {
            switch(nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp; 
                    low++;
                    mid++;
                    break;
                }

                case 1:
                    mid++;
                    break;
                
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
