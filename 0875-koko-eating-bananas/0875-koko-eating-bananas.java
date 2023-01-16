class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i< piles.length; i++){
            max = Math.max(max , piles[i]);
        }
        
        if(h == piles.length){
            return max;
        }
        int beg=0,end=max,ans=0;
        while(beg<=end)
        {
            int  mid=beg+(end-beg)/2;
            if(ispossible(piles,mid,h))
            {
                ans=mid;
                end=mid-1;
                
            }
            else
                beg=mid+1;
        }
        return ans;

    }
    public static boolean ispossible(int []piles,int mid,int h)
    {
       int t=0;
        for(int i=0;i<piles.length;i++)
        {
          t+=(int)Math.ceil((double)piles[i]/mid);
        }
        return t<=h;
    }
}