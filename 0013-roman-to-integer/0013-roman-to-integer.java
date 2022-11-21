class Solution {
    public int romanToInt(String s) {
        s = s.replace("IV", "IIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("CD", "CCCC");
        s=s.replace("IX", "VIIII");
        s=s.replace("XC", "LXXXX");
        s=s.replace("CM", "DCCCC");
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='I')
                ans+=1;
            if(ch=='V')
                ans+=5;
            if(ch=='X')
                ans+=10;
            if(ch=='L')
                ans+=50;
            if(ch=='C')
                ans+=100;
            if(ch=='D')
                ans+=500;
            if(ch=='M')
                ans+=1000;
        }
        return ans;
    }
}