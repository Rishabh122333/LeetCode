class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean freq[]=new boolean[nums.length];
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        print(nums,freq,list,ans);
        return ans;
    }
    private static void print(int[] nums, boolean[] freq, List<Integer> list, List<List<Integer>> ans) {
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(freq[i]==false)
            {
                freq[i]=true;
                list.add(nums[i]);
                print(nums, freq, list, ans);
                freq[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}