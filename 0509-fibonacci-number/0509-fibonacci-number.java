//recursive approach
// class Solution {
//     public int fib(int n) {
//         if(n<2)
//             return n;
//         return fib(n-1)+fib(n-2);
//     }
// }

//dp sol
// class Solution {
//     public int fib(int n) {
//         if(n<2)
//             return n;
//         int dp[]=new int [n+1];
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++)
//         {
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
// }

//best sol 
class Solution {
    public int fib(int n) {
        if(n<2)
            return n;
        int a=0,b=1;
        for(int i=2;i<=n;i++)
        {
            int sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}