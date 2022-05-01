class Solution {
    private class Node{
        private int calc;
        private int x;
        private int y;
        Node(int calc, int x, int y)
        {
            this.calc=calc;
            this.x=x;
            this.y=y;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Node> maxHeap= new PriorityQueue<>((a,b)->(b.calc-a.calc));
        
        for(int[] p: points)
        {
            maxHeap.offer(new Node(p[0]*p[0] + p[1]*p[1]  , p[0], p[1] ));
            
            if(maxHeap.size()>k)
                maxHeap.poll();
        }
        
        int[][] res= new int[k][2];
        
        for(int i=k-1;i>=0;i--)
        {
                res[i][0]= maxHeap.peek().x;
                res[i][1]=maxHeap.poll().y;
        }
        
        return res;
    }
}
