class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                c++;
            if(c>1)
                ans.append(ch);
            if(ch==')')
                c--;
        }
        return ans.toString();
    }
}