class Solution {
    
//     recursive f(cost[],idx) call for i=0 and i=1
//     {
//     if(i>cost.length)
//         return 0;
//     return Math.min(f(cost,i+1),f(cost,i+2))+cost[i];
        
//     }
    
    
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[n-1],dp[n-2]);
        
    }
}