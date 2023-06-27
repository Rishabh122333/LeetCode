class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length,c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                map.put((nums1[i]+nums2[j]),map.getOrDefault((nums1[i]+nums2[j]),0)+1);
            }
        }
        for(int i:nums3)
        {
            for(int j:nums4)
            {
                c+=map.getOrDefault(0-(i+j),0);
            }
            
        }
        return c;
            
    }
}