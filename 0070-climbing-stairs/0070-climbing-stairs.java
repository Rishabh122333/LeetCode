//recursive sol
// class Solution {
//     public int climbStairs(int n) {
//         if(n<=2)
//             return n;
//         int c1=climbStairs(n-1);
//         int c2=climbStairs(n-2);
//         return c1+c2;
//     }
// }

//dp sol
class Solution {
    public int climbStairs(int n) {
        if(n<2)
            return n;
        int dp[]=new int [n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}