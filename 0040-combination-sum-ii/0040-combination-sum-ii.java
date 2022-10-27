class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        
         List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        combiantion(arr, target, 0,list,ans);
        return ans;
    }
    
    
    public static void combiantion(int arr[],int target,int idx,List<Integer>list,List<List<Integer>>ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(i!=idx && arr[i]==arr[i-1])
                continue;
            if(target>=arr[i])
            {
                list.add(arr[i]);
                combiantion(arr, target-arr[i], i+1,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
}