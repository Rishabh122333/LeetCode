class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0,d=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[c]!=nums[d])
            {
                nums[++c]=nums[d++];
            }
            else
                d++;
        }
        return c+1;
    }
}