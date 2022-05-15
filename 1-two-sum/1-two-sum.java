class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c,d,i,j;
        int arr[]=new int[2];
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
            if(nums[i]+nums[j]==target)
            {
                arr[0]=i;
                arr[1]=j;
                break;
            }
            }
        }
        return arr;
    }
}