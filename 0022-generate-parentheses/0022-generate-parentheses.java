class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        calculate(n,0,0,"",ans);
        return ans;
    }
    public static void calculate(int n,int open,int close,String str,List<String>ans)
    {
        if(open==n && close==n)
        {
            ans.add(str);
            return;
        }
        if(open<=n)
        {
            calculate(n,open+1,close,str+'(',ans);
        }
        if(close<=n && open>close)
        {
            calculate(n,open,close+1,str+')',ans);
        }
    }
}