class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        print(nums,0,list,ans);
        return ans;
    }
    
    
    public static void print(int[] nums, int i, List<Integer> list, List<List<Integer>> ans) {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        print(nums, i+1, list, ans);
        list.add(nums[i]);
        print(nums, i+1, list, ans);
        list.remove(list.size()-1);
    }
}