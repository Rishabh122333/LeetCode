class Solution {
    public int lastStoneWeightII(int[] nums) {
         int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return subsetsum(nums,sum,nums.length);
    }
    public static int subsetsum(int []arr,int sum,int n)
    {
        boolean t[][]=new boolean[30+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)
                    t[i][j]=false;
                if(j==0)
                    t[i][j]=true;
            }
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
        int min =Integer.MAX_VALUE;
        for(int i=0;i<=sum/2;i++)
        {
            if(t[n][i])
            {
                min=Math.min(min,sum-2*i);
            }
        }
        return min;
}
}