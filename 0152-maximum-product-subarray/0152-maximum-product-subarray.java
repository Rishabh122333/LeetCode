class Solution {
    //4 cases all +ve, even -ve, odd -ve, has 0. At every pt the max prod can be either suffix or prefix
    // ek baar left side se product lete chalenge ek baar right side se jahan se max mila
    public int maxProduct(int[] nums) {
        int pre=1,suff=1,ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            pre*=nums[i];
            suff*=nums[n-1-i];
            ans=Math.max(ans,Math.max(pre,suff));
            if(suff==0)  //so that they dont carry zero for further calculation
                suff=1;
            if(pre==0)
                pre=1;
        }
        return ans;
    }
}