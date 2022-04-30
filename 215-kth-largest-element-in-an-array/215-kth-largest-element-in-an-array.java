class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int n:nums){
            minHeap.offer(n);
            
            if(minHeap.size()>k)
                minHeap.poll();//poll removes the smallest element
        }
        
        return minHeap.peek();
        
    }
}