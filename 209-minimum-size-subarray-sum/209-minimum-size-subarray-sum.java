class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,ans=Integer.MAX_VALUE,si=0,ei=0;
        while(ei<nums.length)
        {
            sum+=nums[ei];
            while(sum>=target)
            {
                ans=Math.min(ans,ei-si+1);
                sum-=nums[si++];
            }   
            ei++;
        }
        if(ans==Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}