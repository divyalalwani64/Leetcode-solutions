class Solution {
    
  private class Node{
      private int index;
      private int diff;
      Node(int index, int diff){
          this.index=index;
          this.diff=diff;
      }
  }
     public List<Integer> findClosestElements(int[] arr, int k, int x) {
         List<Integer> closest = new ArrayList();
         PriorityQueue<Node> maxHeap= new PriorityQueue<>( (a,b) -> (b.diff==a.diff) ? (b.index - a.index) : (b.diff - a.diff));
         
         for(int i=0;i<arr.length;i++)
         {
             maxHeap.offer(new Node(i, Math.abs(arr[i]-x)));
             if(maxHeap.size()>k)
                 maxHeap.poll();
         }
         
         while(!maxHeap.isEmpty())
             closest.add(arr[maxHeap.poll().index]);
         
         Collections.sort(closest);
         
         return closest;
     }
}


// will take min heap as elements sorted order
//element insert
//size is greater than 

