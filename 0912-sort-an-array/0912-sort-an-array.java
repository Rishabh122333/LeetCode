class Solution {
    public int[] sortArray(int[] nums) {
         int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    
    for(int i=0;i<nums.length;i++)
    {
        min=Math.min(min,nums[i]);
        max=Math.max(max,nums[i]);
    }
    
    int feq[]=new int[max-min+1];
    
    for(int i=0;i<nums.length;i++)
        feq[nums[i]-min]++;
    
    
    int ans[]=new int[nums.length];
    int k=0;
    for(int i=0;i<feq.length;i++)
    {
        if(feq[i]>0)
        {
            while(feq[i]>0)
            {
                ans[k]=i+min;
                feq[i]--;
                k++;
            }
        }
    }
    
    return ans;
    
    
    }
}