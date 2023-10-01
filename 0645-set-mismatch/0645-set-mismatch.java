class Solution {
    public int[] findErrorNums(int[] nums) {
       int sum=0,n=nums.length;
        for(int i:nums)
           sum+=i;
       int dup=duplicate(nums); 
       int total=n*(n+1)/2;
       
        sum-=dup;
        int miss=total-sum;
        return new int[] {dup,miss};
    }
    public int duplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int idx =Math.abs(nums[i])-1;
            if(nums[idx]<0)
                return idx+1;
            nums[idx]*=-1;
        }
        return 0;
    }
}