//same as coin change 2 amt -t coin-s
class Solution {
    public int numDistinct(String s, String t) {
        
        int dp[][]=new int[t.length()+1][s.length()+1];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        return calculate(s,t,0,0,dp);
        
    }
    public static int calculate(String s,String t,int i, int j,int dp[][])
    {
        if(i==t.length())
            return 1;
        if(j==s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int pick=0,notpick=0;
        if(t.charAt(i)==s.charAt(j))
        {
            pick+=calculate(s,t,i+1,j+1,dp);
        }
        notpick+=calculate(s,t,i,j+1,dp);
        return dp[i][j]=pick+notpick;
        
    }
}