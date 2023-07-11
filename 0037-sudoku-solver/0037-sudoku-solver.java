// class Solution {
//     public void solveSudoku(char[][] board) {
//         solve(board,0,0);
//     }
//     public static void solve(char [][]board,int row,int col)
//     {
//         if(col==9)
//         {
//             row++;
//             col=0;
//         }
//         if(row==9)
//         {
//             // display(board);
//             return;
//         }
//         if(board[row][col]!='.')
//             solve(board,row,col+1);
//         else
//         {
//             for(int val=1;val<=9;val++)
//             {
//                 if(ispossible(board,row,col,val))
//                 {
//                     board[row][col]=(char)val;
//                     solve(board,row,col+1);
//                     board[row][col]='.';
//                 }
//             }
//         }
            
//     }
//     public static boolean ispossible(char [][]board,int row,int col,int val)
//     {
//         int r=0;
//         while(r<9)
//         {
//             if(board[r][col]==val)
//                 return false;
//             r++;
//         }
//         int c=0;
//         while(c<9)
//         {
//             if(board[row][c]==val)
//                 return false;
//             c++;
//         }
        
        
//         r=row-(row%3);
//         c=col-(col%3);
//         for(int i=r;i<r+3;i++)
//         {
//             for(int j=c;j<c+3;j++)
//             {
//                 if(board[i][j]==val)
//                     return false;
//             }
//         }
//         return true;
//     }
//     public static void display(char[][]board)
//     {
//         for(int i=0;i<9;i++)
//         {
//             for(int j=0;j<9;j++)
//             {
//                 System.out.print(board[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }


class Solution {
    public void solveSudoku(char[][] board) {
        int[] complete = new int[1];
        solver(board,0,0,complete);
    }
    public static void solver(char[][] board,int row,int col,int[] complete) {
        if (row == board.length-1 && col == board[0].length) {
            complete[0] = 1;
            return;
        }
        if (col == board[0].length) {
            solver(board,row+1,0,complete);
            return;
        }
        if (board[row][col] == '.') {
            for (int i = 1; i<= 9;i++) {
                if (isValid(board,row,col,(char)(i + '0'))) {
                    board[row][col] = (char)(i + '0');
                    solver(board,row,col+1,complete);
                    if (complete[0] != 1) {
                    board[row][col] = '.';
                    }
                } 
            }
        } else {
            solver(board,row,col+1,complete);
        }
    }
    public static boolean isValid(char[][] board,int row,int col,char ch) {   
        //row
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) {
                return false;
            }
        }
        //col
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) {
                return false;
            }
        }
        // 3x3 Grid
        int r = (row/3)*3;
        int c = (col/3)*3;
        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }
}