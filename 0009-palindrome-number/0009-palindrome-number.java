class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0))
            return false;
       int rev=0,n=x;
        while(x>rev)
        {
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        return rev==x || x==rev/10;
}
}