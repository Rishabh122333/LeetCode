class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g=0,total=0,start=0;
        for(int i=0;i<gas.length;i++)
        {
            total+=gas[i]-cost[i];
            g+=gas[i]-cost[i];
            if(g<0)
            {
                g=0;
                start=i+1;
            }
        }
        if(total<0)
            return -1;
        return start;
    }
}