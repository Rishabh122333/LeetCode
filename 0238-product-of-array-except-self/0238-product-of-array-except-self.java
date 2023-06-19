class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int p=1;
        
        for(int i=0;i<nums.length;i++)
        {
            p*=nums[i];
            ans[i]=p;
        }
        p=1;
        for(int i=nums.length-1;i>0;i--)
        {
            ans[i]=p*ans[i-1];
            p*=nums[i];
        }
        ans[0]=p;
        return ans;
    }
}