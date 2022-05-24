class Solution {
    public int splitArray(int[] arr, int m) {
        int beg=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            beg=Math.max(beg,arr[i]);
            end+=arr[i];
        }
        while(beg<end)
        {
            int mid=beg+(end-beg)/2;
            int piece=partitions(arr,mid);
            if(piece<=m)
                end=mid;
            else if(piece>m)
                beg=mid+1;
        }
            return beg;
    }
    public static int partitions(int arr[],int mid)
    {
        int c=1,sum=0;
            for(int i=0;i<arr.length;i++)
            {
                if(sum+arr[i]>mid)
                {
                    sum=arr[i];
                    c++;
                }
                else
                    sum+=arr[i];
            }
        return c;
    }
}