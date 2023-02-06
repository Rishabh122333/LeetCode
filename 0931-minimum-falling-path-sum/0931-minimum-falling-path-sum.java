class Solution {
    public int minFallingPathSum(int[][] arr) {
        
        int m=arr.length;
        int n=arr[0].length;
        int dp[][]=new int [m][n];
        for(int j=0;j<n;j++)
            dp[0][j]=arr[0][j];
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int up=0,ldiag=0,rdiag=0;
                up=arr[i][j]+dp[i-1][j];
                if(j>0)
                    ldiag=arr[i][j]+dp[i-1][j-1];
                else
                    ldiag=Integer.MAX_VALUE;
                if(j<n-1)
                    rdiag=arr[i][j]+dp[i-1][j+1];
                else
                    rdiag=Integer.MAX_VALUE;
                dp[i][j]=Math.min(up,Math.min(ldiag,rdiag));
            }
        }
        int min=dp[m-1][0];
        for(int j=1;j<n;j++)
            min=Math.min(min,dp[m-1][j]);
        return min;
    }
}