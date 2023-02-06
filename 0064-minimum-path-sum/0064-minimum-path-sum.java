class Solution {
    public int minPathSum(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int dp[][]=new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0) 
                    dp[i][j]=arr[i][j];
                else
                {
                    int up=0,left=0;
                    if(i>0) 
                        up=arr[i][j]+dp[i-1][j];
                    else  
                        up=arr[i][j]+999;
                    if(j>0) 
                        left=arr[i][j]+dp[i][j-1];
                    else  
                        left=arr[i][j]+999;
                    dp[i][j]=Math.min(up,left);
                }
            }
        }
        return dp[m-1][n-1];
    }
}