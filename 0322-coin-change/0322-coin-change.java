class Solution {
    public int coinChange(int[] coin, int amount) {
        int n=coin.length;
        int t[][]=new int [n+1][amount+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j =0 ;j<amount+1;j++)
            {
                if(i==0)
                    t[i][j]=Integer.MAX_VALUE-1;
                if(j==0)
                    t[i][j]=0;
                if(i==1)
                {
                    if(j%coin[0]==0)
                        t[i][j]=j/coin[0];
                    else
                        t[i][j]=Integer.MAX_VALUE-1;
                }
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<amount+1;j++)
            {
                if(coin[i-1]<=j)
                {
                    t[i][j]=Math.min(t[i][j-coin[i-1]]+1,t[i-1][j]);
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        if(t[coin.length][amount]==Integer.MAX_VALUE-1)
            return -1;
        return t[coin.length][amount];
    }
}