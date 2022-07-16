class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            int c=0;
            for (int j:nums) {
                if(j<nums[i])
                    c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}