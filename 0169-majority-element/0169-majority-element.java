class Solution {
    public int majorityElement(int[] nums) {
        int curr=-1,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(curr==-1)
                curr=nums[i];
            if(nums[i]==curr)
                c++;
            else
                c--;
            if(c==0)
            {
                curr=-1;
            }
        }
        return curr;
    }
}