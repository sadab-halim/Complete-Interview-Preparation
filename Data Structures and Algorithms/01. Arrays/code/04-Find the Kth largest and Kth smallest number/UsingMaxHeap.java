import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* ------------------- T.C: O(nlog(k) ----------------- */
class UsingMaxHeap {
    public static int findKthSmallest(List<Integer> input, int k) {
        // base case
        if (input == null || input.size() < k)
            System.exit(-1);
        
        // create a max-heap using the PriorityQueue class and 
        // insert the first 'k' array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(input.subList(0, k));

        for(int i = k; i < input.size(); i++) {
            // if the current element is less than the root of the heap
            if(input.get(i) < pq.peek()) {
                // replace root with current element
                pq.poll();
                pq.add(input.get(i));
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;

        System.out.println("Kth smallest array element is " + findKthSmallest(input, k));
    }
}