class Solution {
    public int minDistance(String text1, String text2) {
        int [][]dp=new int [text1.length()+1][text2.length()+1];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        return calculate(text1,text2,0,0,dp);
    }
    public static int calculate(String str1,String str2,int i,int j,int [][]dp)
    {
        if(i==str1.length())
            return str2.length()-j;
        if(j==str2.length())
            return str1.length()-i;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        if(str1.charAt(i)==str2.charAt(j))
        {
            ans=calculate(str1,str2,i+1,j+1,dp);
        }
        else
        {
            int insert=calculate(str1,str2,i,j+1,dp);
            int delete=calculate(str1,str2,i+1,j,dp);
            int replace=calculate(str1,str2,i+1,j+1,dp);
            ans=Math.min(insert,Math.min(delete,replace))+1;
        }
        return dp[i][j]=ans;
    }
}