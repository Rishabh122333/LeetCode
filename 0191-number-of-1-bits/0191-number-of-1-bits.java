public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int mask=1,c=0;
        for(int i=0;i<32;i++)
        {
        if((n&mask)!=0)
        {
            c++;
        }
        mask<<=1;
        }
        return c;
    }
}