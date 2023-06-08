class Solution {
    public int knightDialer(int n) {
        
        int [][][] dp=new int[n][4][3];
        for(int arr[][]:dp)
        {
            for(int a[]:arr)
                Arrays.fill(a,-1);
        }
        long ans=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
                ans=(ans+count(n-1,i,j,dp))%1000000007;
        }
        return (int)ans%((int)Math.pow(10,9)+7);
        
    }
    public static int count(int n,int r,int c,int [][][]dp)
    {
        if((r<0 || c<0 || r>=4|| c>=3) || (r==3 && c==0) || (r==3 && c==2))
            return 0;
        if(n==0)
            return 1;
        if(dp[n][r][c]!=-1)
            return dp[n][r][c];
        int row[]={-2,-2,2,2,1,-1,1,-1};
        int col[]={-1,1,-1,1,-2,-2,2,2};
        long ans=0;
        for(int i=0;i<col.length;i++)
        {
            ans=(ans+count(n-1,r+row[i],c+col[i],dp))%1000000007;
        }
        return dp[n][r][c]=(int)ans%((int)Math.pow(10,9)+7);
    }
}