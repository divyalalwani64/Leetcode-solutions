class Solution {
    public void gameOfLife(int[][] board) {
       int dir[][]= new int[][]{{0,1},{1,1},{1,0},{-1,1},{0,-1},{-1,-1},{-1,0},{1,-1}};//direction arrray -> possible 8 directions from the origin(0,0).
        int row=board.length;
        int col=board[0].length;
       
        for(int i=0;i<row;i++){//iterate through all rows
            for(int j=0;j<col;j++){//iterate through all cols
                int count=0;
                for(int d[]:dir) // any cell can have 8 neighbours, will iterate through all of them.
                {
                    int p=i+d[0];
                    int q=j+d[1];
                    if(p>=0 && p<row && q>=0 && q<col && (board[p][q]==1 || board[p][q]==2))// check if neighbours are in range of matrix or not. and count 1 also keep track of cells which were previously alive(value=2).
                        count++;
                }
                
                if(board[i][j]==1){
                    //as it is already 1, we will only focus on updating 0.
                     if(count<2 || count>3)//condition 1 && condition 2
                        board[i][j]=2;// previous alive: now dead;
                }
                else{
                     if(count==3)// condition 4
                        board[i][j]=3;//previous dead: now alive
                }
            }
        }
        //update back 2 to 0 && 3 to 1
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                board[i][j]%=2;
        }
        
        //Tc: O(n)
        //SC:O(1)
    }
}