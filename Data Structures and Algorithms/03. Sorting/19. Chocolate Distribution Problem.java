/* ----------- Chocolate Distribution Problem ----------- */
/* Given an array of n integers where each value represents the number of chocolates in a packet. 
   Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 
   
   1. Each student gets one packet.
   2. The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
*/

/*
Examples:
Input : arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3 
Output: Minimum Difference is 2 

Explanation:
We have seven packets of chocolates and 
we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum 
difference between maximum and minimum packet 
sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
Output: Minimum Difference is 6 

Explanation:
The set goes like 3,4,7,9,9 and the output 
is 9-3 = 6
*/

/* ---------------- NAIVE METHOD ---------------- */
/* ------ APPROACH ------- */ 
/*A simple  solution is to generate all subsets of size m of arr[0..n-1]. 
For every subset, find the difference between the maximum and minimum elements in it. 
Finally, return the minimum difference.
*/

/* ---------------- NAIVE METHOD ---------------- */
/* ------ APPROACH ------- */ 
/* A simple  solution is to generate all subsets of size m of arr[0..n-1]. 
For every subset, find the difference between the maximum and minimum elements in it. 
Finally, return the minimum difference.
*/


/* ---------------- EFFICIENT METHOD, T.C: O(nlogn) ---------------- */
/* ------ APPROACH ------- */ 
/* An efficient solution is based on the observation that to minimize the difference, 
   we must choose consecutive elements from a sorted packet. We first sort the array arr[0..n-1], 
   then find the subarray of size m with the minimum difference between the last and first elements.
*/

import java.util.*;
class Main {
    public static int findMinDiff(int arr[], int m) {
        int n = arr.length;

        if(m == 0 || n == 0)
            return 0;
        Arrays.sort(arr);
        // no of students cannot be more than packets
        if(n < m)
            return -1;
        // largest no of chocolates
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if(diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23,
                     25, 41, 30, 40, 28,
                     42, 30, 44, 48, 43, 50};
        int m = 7;  
        System.out.println("Minimum difference is " + findMinDiff(arr, m));
    }
}