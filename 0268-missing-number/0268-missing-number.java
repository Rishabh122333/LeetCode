class Solution {
    public int missingNumber(int[] nums) {
        int max=nums.length,total=0;
        total=max*(max+1)/2;
        for(int i=0;i<nums.length;i++)
        {
            total-=nums[i];
        }
        return total;
    }
}