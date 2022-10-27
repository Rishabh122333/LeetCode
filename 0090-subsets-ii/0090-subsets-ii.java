class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        print(nums,0,list,ans);
        return ans;
    }
    
    public static void print(int[] nums, int idx, List<Integer> list, List<List<Integer>> ans) {
        if(idx==nums.length)
        {
            if(!(ans.contains(list)))
                ans.add(new ArrayList<>(list));
            return;
        }
        for (int i =idx; i < nums.length; i++) {
            if(i!=idx && nums[i]==nums[i-1])
                continue;
            print(nums, i+1, list, ans);
            list.add(nums[i]);
            print(nums, i+1, list, ans);
            list.remove(list.size()-1);
            
        }
    }
}