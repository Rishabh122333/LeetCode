class Solution {
    public double myPow(double x, int n) {
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        long n1=n;
        double ans=calculate(x,Math.abs(n1));
        if(n<0)
            return 1/ans;
        return ans;
    }
    public double calculate(double x, long n)
    {
        if(n==0)
            return 1;
			
        if(n%2==0)
            return calculate(x*x, n/2);
        else
            return x * calculate(x,n-1);
    }
}