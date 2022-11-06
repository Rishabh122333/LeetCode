class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean [][]board =new boolean[n][n];
        List<List<String>> ans=new ArrayList<>();
        queen(n, board, 0, ans);
        return ans;
    }
    public static void queen(int n,boolean board[][],int row,List<List<String>> ans)
    {
        if(n==0)
        {
            List<String> list =new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String str="";
                for (int j = 0; j < board[0].length; j++) {
                    if(board[i][j])
                        str=str+"Q";
                    else
                        str=str+".";
                }
                list.add(str);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        if(row==board.length)
            return;
        for (int col = 0; col < board.length; col++) {
            if(ispossible(board,row,col))
            {
                board[row][col]=true;
                queen(n-1, board, row+1, ans);
                board[row][col]=false;

            }
            
        }
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
        while(r>=0 && c<board[0].length)
        {
            if(board[r][c])
                return false;
            r--;
            c++;
        }
        return true;
    }
}