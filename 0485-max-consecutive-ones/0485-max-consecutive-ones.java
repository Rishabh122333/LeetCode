class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c=0;
            }
            else 
            {
                c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}