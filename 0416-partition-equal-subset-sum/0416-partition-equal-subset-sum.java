class Solution {
    public boolean canPartition(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if(sum%2!=0)
            return false;
        return calculate(nums,nums.length,sum/2);
    }
    public static boolean calculate(int []arr,int n,long sum)
    {
        boolean [][]t=new boolean [200+1][(int)sum+1];
        for(int i=0;i<n+1;i++)
        {
            t[i][0]=true;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[n][(int)sum];
    }
}