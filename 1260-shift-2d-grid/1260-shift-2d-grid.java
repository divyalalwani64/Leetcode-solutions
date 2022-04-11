class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result= new ArrayList();
        int rows= grid.length;
        int cols= grid[0].length; 
        k=k%(rows*cols);
        for(int i=0;i<k;i++)
        {
            int temp=grid[0][0];
            for(int j=(rows*cols)-1;j>=0;j--)
            {
                int x=j/cols;
                int y=j%cols;
                if( x==rows-1 && y==cols-1)
                {
                    x=0;
                    y=0;
                }
                else if(y==cols-1)
                {
                    x++;
                    y=0;
                }
                else
                    y++;
                grid[x][y]=grid[j/cols][j%cols];
                if(j==0)
                    grid[x][y]=temp;
            }
        }
        for(int i=0;i<rows;i++)
        {
            List<Integer> row= new ArrayList();
            for(int j=0;j<cols;j++)
                row.add(grid[i][j]);
            result.add(new ArrayList<>(row));
        }
        return result;
    }
}