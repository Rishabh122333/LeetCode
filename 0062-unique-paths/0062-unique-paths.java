class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [m][n];
        for(int []a:dp)
            Arrays.fill(a,-1);
        return calculate(m,n,0,0,dp);
    }
    public static int calculate(int m,int n,int i, int j,int [][]dp)
    {
        if(i==m-1 && j==n-1)
            return 1;
        if(i>= m || j>=n)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int down =calculate(m,n,i+1,j,dp);
        int right=calculate(m,n,i,j+1,dp);
        return dp[i][j]=right +down;
    }
}
