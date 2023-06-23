class Solution {
    //sum 0 kr rhe h kyunki -ve number me -ve add krne se vo aur chota hoga, hr baar 0 se nyi subarray start ho rhi
    public int maxSubArray(int[] nums) {
        int ans=nums[0],sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            ans=Math.max(ans,sum);
             if(sum<0)
                sum=0;
            
        }
        return ans;
    }
}