class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
    	int d=1;
    	for (int i=0;i<nums.length;i++) {
    		d*=nums[i];
            ans[i]=d;
    	}
        d=1;
    	for(int i=nums.length-1;i>0;i--) {
    		ans[i]=d*ans[i-1];
    		d*=nums[i];
    	}
        ans[0]=d;
    	return ans;
    }
}