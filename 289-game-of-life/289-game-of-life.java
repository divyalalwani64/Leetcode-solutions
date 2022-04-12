class Solution {
    public void gameOfLife(int[][] board) {
       int dir[][]= new int[][]{{0,1},{1,1},{1,0},{-1,1},{0,-1},{-1,-1},{-1,0},{1,-1}};//direction arrray -> possible 8 directions from the origin(0,0).
        int row=board.length;
        int col=board[0].length;
        int res[][]=new int[row][col];// will use an extra array
        for(int i=0;i<row;i++){//iterate through all rows
            for(int j=0;j<col;j++){//iterate through all cols
                int count=0;
                for(int d[]:dir) // any cell can have 8 neighbours, will iterate through all of them.
                {
                    int p=i+d[0];
                    int q=j+d[1];
                    if(p>=0 && p<row && q>=0 && q<col && board[p][q]==1)// check if neighbours are in range of matrix or not. and count 1.
                        count++;
                }
                //We will only use 2 conditions , because by default all the values of array will be 0, our focus to update only 1.
                if(board[i][j]==1){
                     if(count==2 || count==3)//condition 2
                        res[i][j]=1;
                }
                else{
                     if(count==3)// condition 4
                        res[i][j]=1;
                }
            }
        }
        //Copy back to array board, because return type is void.
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                board[i][j]=res[i][j];
        }
        
        //Tc: O(n)
        //SC:O(n)
    }
}