//saare nums k ek ek bit position pr 1's count krnege aur unko mod 3 krenge to agr 1 aaya to ans ki vo bit 1 h

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int c=0;
            for(int num:nums )
            {
                if(((num >> i) & 1)==1)
                    c++;
            }
            c%=3; //jitne baar no. repeat ho usse mod
            if(c!=0)
                ans=ans| (c << i); 
        }
        return ans;
    }
}