class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,sum=0;
        for (int i:gain) {
            sum+=i;
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
    }
}