class Solution {
    public int totalNQueens(int n) {
        boolean [][]board =new boolean[n][n];
        int ans=queen(n, board,0);
        return ans;
    }
     public static int  queen(int n,boolean board[][],int row)
    {
        if(n==0)
        {
            return 1;
        }
        if(row==board.length)
            return 0;
        int c=0;
        for (int col = 0; col < board.length; col++) {
            if(ispossible(board,row,col))
            {
                board[row][col]=true;
                c+=queen(n-1, board, row+1);
                board[row][col]=false;

            }
            
        }
        return c;
    }
    public static boolean ispossible(boolean[][] board, int row, int col) {
        int r=row;
        while(r>=0)
        {
            if(board[r][col])
                return false;
            r--;
        }
        r=row;
        int c=col;
        while(r>=0 && c>=0)
        {
            if(board[r][c])
                return false;
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<board.length)
        {
            if(board[r][c])
                return false;
            r--;
            c++;
        }
        return true;
    }
}