// recusrive sol
// class Solution {
//     public int rob(int[] nums) {
        
//         return calculate(nums,nums.length-1);
//     }
//     public static int calculate(int nums[],int idx)
//     {
//         if(idx==0)
//             return nums[idx];
//         if(idx <0)
//             return 0;
//         int pick=nums[idx] + calculate(nums,idx-2);
//         int notpick=0 + calculate(nums,idx-1);
//         return Math.max(pick,notpick);
//     } 
// }

//dp sol
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            int pick=nums[i];
            if(i>1)
                pick+=dp[i-2];
            int notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[n-1];
        
    }
}