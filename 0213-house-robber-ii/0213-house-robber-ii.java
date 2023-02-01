class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int arr1[] = new int[n-1]; // we cant include first and last elements as they are adjacent
        int arr2[] = new int[n-1]; // we create 2 arrays onr with last and not first and vice versa
        for(int i=0; i<n-1; i++){
            arr1[i] = nums[i];    //include first element and not include last element
            arr2[i] = nums[i+1];  //not include first element and include last element
        }
        return Math.max(help(arr1),help(arr2));
    }
    public static int help(int[] nums) {
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++)
        {
            int pick=nums[i];
            if(i>1)
                pick+=prev2;
            int notpick=0+prev;
            int curr=Math.max(pick,notpick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}