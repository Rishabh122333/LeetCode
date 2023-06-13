//we will keep a track of min element so far and go on calculating max profit for everyday
class Solution {
    public int maxProfit(int[] prices) {
        int minsofar=Integer.MAX_VALUE,max=0;
        for(int i=0;i<prices.length;i++)
        {
            minsofar=Math.min(minsofar,prices[i]);
            int profit=prices[i]-minsofar;
            max=Math.max(max,profit);
        }
        return max;
    }
}