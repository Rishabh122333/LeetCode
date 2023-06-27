//brute - har element k liye uske agle elements k liye linear search
//better - sort array 
//optimal - saare elements set me daal do fir agr usse pehle wala elment h to usko skip kro agr nhi h to aage k count kro
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer> set=new HashSet<>();
        int c=0,ans=Integer.MIN_VALUE;
        for(int i:nums)
            set.add(i);
        for(int i:nums)
        {
            
            if(!set.contains(i-1))
            {
                
                c=1;
                while(set.contains(i+1))
                {
                    c++;
                    i++;
                }
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}