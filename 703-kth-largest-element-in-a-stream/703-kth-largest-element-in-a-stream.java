//We will make use of min heap to store k elements.
class KthLargest {
    private int k;
    //heaps are implememted using priority queue in java.
    private PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        for(int n:nums)
            pq.offer(n); 
        
        while(pq.size()>k)
            pq.poll();
    }
    
    public int add(int val) {
        pq.offer(val);
        
        if(pq.size()>k)
            pq.poll();
        
        return pq.peek();
    }
}
//SC: O(k);
//TC: O(n logk); logk for maintaining heap property

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */