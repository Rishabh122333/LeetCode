class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for (int i:nums) {
            int d=(int)Math.log10(i)+1;
            if(d%2==0)
            {
                c++;
            }
        }
        return c;
    }
}