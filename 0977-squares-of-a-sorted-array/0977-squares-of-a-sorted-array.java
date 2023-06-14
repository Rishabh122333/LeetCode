class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1,c=n-1;
        int ans[]=new int[n];
        while(i<=j)
        {
            if(Math.abs(nums[i])>nums[j])
            {
                ans[c--]=nums[i++];
            }
            else
            {
                ans[c--]=nums[j--];   
            }
        }
        for(int k=0;k<n;k++)
        {
            ans[k]=ans[k]*ans[k];
        }
        return ans;
    }
}