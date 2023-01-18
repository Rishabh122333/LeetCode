// Let sum of subset 1 be s1 and subset 2 with s2
// s1 - s2 = diff (given)
// s1 + s2=sum of array (logical)
// Therefore adding both eq we get :
// 2s1= diff + sum of array
// s1= (diff + sum of array)/2;
// Problem reduces to find no of subsets with given sum

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if(sum-target<0 || (sum-target)%2==1)
            return 0;
        sum=(sum-target)/2;
        return countsubsetsum(nums,sum,nums.length);
        
    }
    public static int countsubsetsum(int []arr,int sum,int n)
    {
        int t[][]=new int [n+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=1;
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[n][sum];
    }
}