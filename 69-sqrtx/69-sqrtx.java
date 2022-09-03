class Solution {
    public int mySqrt(int n) {
        if(n==1)
            return 1;
        long beg=1,end=n,ans=0;
            while(beg<=end)
            {
                    long mid=beg+(end-beg)/2;
                    if(mid*mid<=n)
                    {
                            ans=mid;
                            beg=mid+1;
                    }
                    else
                        end=mid-1;
            }
            return (int)ans;
    }
}