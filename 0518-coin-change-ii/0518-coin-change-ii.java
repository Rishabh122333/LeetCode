// recusrive f(int coin[],amt,int idx)
// {
//     if(amt==0)
//         return 1;
//     if(idx==coin.length)
//         return 0;
//     int pick=0,notpick=0;
//     if(amt>=coin[idx])
//         pick+=f(coin,amt-coin[i],idx)
//     notpick+=f(coin,amt,i+1);
//     return pick+notpick;
// }

class Solution {
    
    public int change(int amount, int[] coin) {
        
        int n=coin.length;
        int dp[][]=new int [amount+1][n+1];
        for(int i=0;i<=amount;i++)
            Arrays.fill(dp[i],-1);
        return calculate(coin,amount,0,dp);
    }
    
    public static int calculate(int coin[],int amt,int idx,int dp[][])
    {
        if(amt==0)
            return 1;
        if(idx==coin.length)
            return 0;
        if(dp[amt][idx]!=-1)
            return dp[amt][idx];
        int pick=0,notpick=0;
        if(amt>=coin[idx])
            pick+=calculate(coin,amt-coin[idx],idx,dp);
        notpick+=calculate(coin,amt,idx+1,dp);
        return dp[amt][idx]=pick+notpick;
    }    
}