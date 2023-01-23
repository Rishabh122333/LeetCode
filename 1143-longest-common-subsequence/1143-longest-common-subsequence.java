// recursive sol

// class Solution {
//     public int longestCommonSubsequence(String x, String y) {
       
//         return lcs(x,y,x.length(),y.length());
//     }
//     public static int lcs(String x, String y,int m,int n)
//     {
//         if(m==0 || n==0)
//             return 0;
//         if(x.charAt(m-1)==y.charAt(n-1))
//         {
//             return 1+lcs(x,y,m-1,n-1);
//         }
//         else
//         {
//             return Math.max(lcs(x,y,m-1,n), lcs(x,y,m,n-1));
//         }
//     }
// }

class Solution {
    public int longestCommonSubsequence(String x, String y) {
        int m=x.length();
        int n=y.length();
        int t[][]=new int [m+1][n+1];
        
        for (int j = 0; j < n+1; j++)
            t[0][j] = 0;

        for (int i = 1; i < m+1; i++)
            t[i][0] = 0;

        for(int i=1;i<m+1;i++)
        { 
            for(int j=1;j<n+1;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1))
                {
                    t[i][j]=1+t[i-1][j-1];
                }
                else
                {
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }
}