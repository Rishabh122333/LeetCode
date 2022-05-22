class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }
        public static int search(int nums[],int target,boolean firstoccurence)
        {
             int beg=0;
        int end=nums.length-1;
            int ans=-1;
        while(beg<=end)
        {
            int mid=beg+(end-beg)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                if(firstoccurence)
                    end=mid-1;
                else
                    beg=mid+1;
            }
           else if(nums[mid]>target)
                  end=mid-1;
            else if(nums[mid]<target)
                beg=mid+1;
        }
            return ans;
    }
}