class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result= new ArrayList();
        int rows= grid.length;
        int cols= grid[0].length; 
        int dimensions=rows*cols;
         k=k%(rows*cols);
        
      
        for(int i=0;i<rows;i++)
            result.add(new ArrayList());// filling all the rows of result with empty lists
        int begin=dimensions-k; // element at (begin) will be at 0,0 in new grid
        int x=0;
        for(int i=begin;i<begin+dimensions;i++)
        {
            int r=(i/cols)%rows;// calculating row and cell for new grid
            int c=i%cols;
            result.get(x/cols).add(grid[r][c]);// adding new element in new row
            x++;
        }
        return result;
// Time Complexity =O(N+N)=O(2N)=O(N)
//Space Complexity=O(N)
    }
}