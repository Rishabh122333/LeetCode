class Solution {
    public void moveZeroes(int[] nums) {
        int curr=0,idx=0;
        while(curr<nums.length)
        {
            if(nums[curr]!=0)
            {
                nums[idx++]=nums[curr++];
            }
            else
            {
                curr++;
            }
        }
        while(idx<nums.length)
        {
            nums[idx++]=0;
        }
    }
}