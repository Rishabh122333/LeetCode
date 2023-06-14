class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length==1)
            return 0;
        int leftsum=0,sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        for(int i=0;i<nums.length;i++)
        {
            if(leftsum==sum-leftsum-nums[i])
                return i;
            leftsum+=nums[i];
        }
        
        
        return -1;
    }
}