class Solution {
    //Binary Search
    
     public List<Integer> findClosestElements(int[] arr, int k, int x) {
         List<Integer> closest = new ArrayList();
         int low=0, high=arr.length-1;
         while(high-low >= k){ // This will run (N-k) times
             if(Math.abs(arr[low]-x) > Math.abs(arr[high]-x))
                 low++;
             else
                 high--; 
         }
         
         for(int i=low;i<=high;i++)
             closest.add(arr[i]);
         
         return closest;
     }
    
    //TC: O(N-k) times
    //SC: O(N)
}

