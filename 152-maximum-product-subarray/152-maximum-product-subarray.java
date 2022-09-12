class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int ma=ans,mi=ans;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp=ma;
                ma=mi;
                mi=temp;
            }
            ma=Math.max(nums[i],ma*nums[i]);
            mi=Math.min(nums[i],mi*nums[i]);
            ans=Math.max(ans,ma);
        }
        return ans;
    }
}