class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=kadane(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]*=-1;
        }
        int minsum=kadane(nums);
        sum+=minsum;
        if(sum==0)
            return maxsum;
        return Math.max(maxsum,sum);
    }
    public static int kadane(int arr[])
    {
        int max=arr[0],sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
        return max;
    }
}