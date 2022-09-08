class Solution {
    public String reverseWords(String s) {
        String str="";
        StringBuilder ans=new StringBuilder();
        s=" "+s;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(str !="")
                {
                    ans.append(str+" ");
                    str="";
                }
            }
            else if(ch!=' ')
                str=ch+str;
        }
        return ans.toString().trim();
    }
}