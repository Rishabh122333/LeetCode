class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int key1=Integer.MIN_VALUE,key2=Integer.MIN_VALUE,c1=0,c2=0;
        for(int i:nums)
        {
            if(key1==i)
            {
                c1++;
            }
            else if(key2==i)
            {
                c2++;
            }
            else if(c1==0)
            {
                key1=i;
                c1=1;
            }
            else if(c2==0)
            {
                key2=i;
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i:nums)
        {
            if(i==key1)
                c1++;
            if(i==key2)
                c2++;
        }
        if(c1>nums.length/3)
            list.add(key1);
         if(c2>nums.length/3)
            list.add(key2);
        return list;
    }
}