class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr2.length;i++)
        {
            map.put(arr2[i],i);
        }
        for(int i=0;i<arr1.length;i++)
        {
            int f=0;
            for(int key:map.keySet())
            {
                if(Math.abs(arr1[i]-key)<=d)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                ans++;
        }
        return ans;
    }
}