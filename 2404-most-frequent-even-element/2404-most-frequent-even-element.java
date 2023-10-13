class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=-1,max=0;
        for(int i:map.keySet())
        {
            if(i%2==0)
            {
                if(map.get(i)>max)
                {
                    max=map.get(i);
                    ans=i;
                }
                else if(map.get(i)==max)
                {
                    ans=ans>i?i:ans;
                }
            }   
        }
        return ans;
    }
}