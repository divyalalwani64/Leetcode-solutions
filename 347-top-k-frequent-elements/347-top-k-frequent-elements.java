class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(k==nums.length)
            return nums;
        
        // we store element as key , and count of its values.
        HashMap<Integer, Integer> count  = new HashMap();
        for(int n: nums)
            count.put(n, count.getOrDefault(n,0)+1);
        
        //Priority Queue which store elements on the basis of count in ascending order.
        //min heap is used because we want to remove element with minimum count from the top.
        PriorityQueue<Integer> minHeap = new PriorityQueue((a,b) -> count.get(a)-count.get(b));
        
        for(int n : count.keySet())
        {
            minHeap.offer(n);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        
        //copying all elements in heap
        int top[] = new int[k];
        for(int i=k-1;i>=0;i--)
            top[i]=minHeap.poll();
        
        return top;
        
        
    }
}