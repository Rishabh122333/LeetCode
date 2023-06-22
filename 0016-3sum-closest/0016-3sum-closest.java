class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int n=nums.length;
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++)
        {
            int j=i+1,k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(ans-target)>Math.abs(sum-target))
                {
                    ans=sum;                    
                }
                else if(sum<target)
                    j++;
                else
                    k--;
            }
        }
        return ans;
    }
}