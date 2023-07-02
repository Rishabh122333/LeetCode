class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        int maxdist=0,curr=0,jumps=0;
        for(int i=0;i<nums.length;i++)
        {
            maxdist=Math.max(maxdist,i+nums[i]);
            if(i==curr)
            {
                jumps++;
                curr=maxdist;
            }
            if(curr>nums.length-2)
                break;
        }
        return jumps;
    }
}