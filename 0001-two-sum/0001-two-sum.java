class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(target-arr[i]))
            {
                ans[1]=i;
                ans[0]=map.get(target-arr[i]);
            }
            else
                map.put(arr[i],i);
        }
        return ans;
    }
}