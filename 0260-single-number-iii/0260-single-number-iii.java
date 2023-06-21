//pehle saare num ka xor kro fir jo ans aaya vo dono unique no. ka xor hoga
// to dono no. ki jo rigthmost set bit hogi unme ek ki bit 0 hogi dusre ki 1 
// hm 2 grp bnaayenge jiski ye bit 1 h aur jiski 0 fir dono grp ka xor krne pr dono unqiue ans aa jaaygea(mask use)
//rightmost set bit mask bnane k liye usi no k 2's complemnt se and kr do

class Solution {
    public int[] singleNumber(int[] nums) {
        
        
        int xor=0;
        for(int i:nums)
            xor^=i;
        int mask=xor & -xor;
        int x=0,y=0;
        for(int i:nums)
        {
            if((i & mask)==0)
            {
                x^=i;
            }
            else
            {
                y^=i;
            }
                
        }
        int ans[]={x,y};
        return ans;
        
    }
}