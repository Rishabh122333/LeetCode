class Solution {
    public int[] shuffle(int[] nums, int n) {
         int ans[]=new int[nums.length];
        for (int i = 0,j=0; i < n; i++,j+=2) {
            ans[j]=nums[i];
            ans[j+1]=nums[i+n];
        }
        return ans;
    }
}