class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int start=0,end=n-1,idx=n-1;
        while(start<=end)
        {
            if(Math.abs(nums[start])>Math.abs(nums[end]))
            {
                ans[idx--]=nums[start]*nums[start];
                start++;
               
            }
            else
            {
                ans[idx--]=nums[end]*nums[end];
                end--;
            }
        }
        return ans;
    }
}