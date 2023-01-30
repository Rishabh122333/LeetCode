class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int idx=Math.abs(nums[i]);
            if(nums[idx-1]>0)
                nums[idx-1]=-nums[idx-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                ans.add(i+1);
        }
        return ans;
    }
}