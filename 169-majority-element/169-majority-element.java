class Solution {
    public int majorityElement(int[] nums) {
        int c=0,key=0;
        for(int i:nums)
        {
            if(c==0)
            {
                key=i;
            }
            if(key==i)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return key;
    }
}