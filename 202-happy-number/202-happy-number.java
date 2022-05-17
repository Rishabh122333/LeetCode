class Solution {
    public boolean isHappy(int n) {
        int fast=n,slow=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
            }while(slow!=fast);
        if(slow==1)
        {
            return true;}
        return false;
        
    }
    public static int square(int n)
    {
        int d,sum=0;
    while(n>0)
    {
        d=n%10;
        n/=10;
        sum+=d*d;
    }
    return sum;
}}