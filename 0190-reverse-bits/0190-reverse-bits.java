public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int mask=1;
        for(int i=0;i<32;i++)
        {
            mask<<=1;
            mask=mask+(n&1);
            n>>=1;
        }
        return mask;
    }
}