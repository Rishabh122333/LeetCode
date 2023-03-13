class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=(nums1.length<nums2.length)? nums1.length : nums2.length; 
        ArrayList<Integer> list=new ArrayList<>();
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else
                map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                map.put(nums2[i],map.get(nums2[i])-1);
                list.add(nums2[i]);
                if(map.get(nums2[i])==0)
                    map.remove(nums2[i]);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
            ans[i]=list.get(i);
        return ans;
    }
}