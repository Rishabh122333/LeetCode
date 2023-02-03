// class Solution {
//     public int uniquePaths(int m, int n) {
//         return path(m,n,m-1,n-1);
//     }
//     public static int path(int m,int n, int i,int j)
//     {
//         if(i==0 && j==0)
//         {
//             return 1;
//         }
//         if(i<0 || j<0)
//         {
//             return 0;
//         }
//         int up=path(m,n,i-1,j);
//         int left=path(m,n,i,j-1);
//         return up+left;
//     }
// }

class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [m][n];
        dp[0][0]=1;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 if(i==0 && j==0)
                     dp[0][0]=1;
                 else 
                 {
                     int up=0,left=0;
                      if(i>0)
                        up=dp[i-1][j];
                     if(j>0)
                        left=dp[i][j-1];
                     dp[i][j]=up+left;
                 }
            }
            
        }
        return dp[m-1][n-1];
    }
}