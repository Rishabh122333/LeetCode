class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
       HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i:nums)
        {
            if(!map.containsKey(i-1))
            {
                map.put(i,true);
            }
            else
            {
                map.put(i,false);
            }
            if(map.containsKey(i+1))
            {
                map.put(i+1,false);
            }
        }
        for(int key:map.keySet())
        {
            int c=0;
            if(map.get(key))
            {
                while(map.containsKey(key))
                {
                    c++;
                    key++;
                }
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}