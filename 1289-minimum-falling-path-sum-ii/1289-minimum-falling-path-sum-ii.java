class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int dp[][]=new int [n][n];
        for(int a[]:dp)
            Arrays.fill(a,-1000);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            ans=Math.min(ans,calculate(matrix,n,0,i,dp));
        return ans;
    }
    public static int calculate(int [][]matrix,int n,int i, int j,int [][]dp)
    {
        if(j<0 || j>=n)
            return Integer.MAX_VALUE;
        if(i==n-1)
        {
            return matrix[i][j];
        }
        if(dp[i][j]!=-1000)
            return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int col=0;col<n;col++)
        {
            if(j!=col)
                ans=Math.min(ans,calculate(matrix,n,i+1,col,dp));
        }
        return dp[i][j]=matrix[i][j]+ans;
    }
}