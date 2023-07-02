class Solution {
    //har pt pr ja kr dekhna h ki wahan se max kahan tk ja skte h kahin pr bhi maxdist se aage ho gye to false 
    public boolean canJump(int[] nums) {
        int maxdist=0;
        for(int i=0;i<nums.length;i++)
        {
            if(maxdist<i)
                return false;
            maxdist=Math.max(maxdist,i+nums[i]);
        }
        return true;
    }
}