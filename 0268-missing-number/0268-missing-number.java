class Solution {
    public int missingNumber(int[] nums) {
        int max=0,sum=0,total=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            sum+=nums[i];
        }
        if(min!=0)
            return 0;
        total=max*(max+1)/2;
        if(total==sum)
        {
            return max+1;
        }
        else
            return total-sum;
    }
}