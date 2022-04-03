import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/* -------------------- T.C: O(n + klog(n)) -------------------- */
class UsingMinHeap { 
    public static int findKthSmallest(List<Integer> input, int k) {
        if(input == null || input.size() < k)
            System.exit(-1);
        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(input);
        // pop from min-heap exactly `k-1` times
        while(--k > 0)
            pq.poll();
        return pq.peek();
    }   
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;
        System.out.println("Kth Smallest Array Element is " + findKthSmallest(input, k));
    }
}