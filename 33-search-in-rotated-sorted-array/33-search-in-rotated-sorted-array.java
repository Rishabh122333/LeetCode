class Solution {
     public static int binarySearch(int[] arr, int target,int start,int end) {
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                return mid;
            }
        }
        return -1;
    }
    public static int findpivot(int arr[])
    {
          int beg = 0;
        int end = arr.length - 1;

        while(beg<=end)
        {
            int mid = beg + (end - beg) / 2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            else if(mid>beg && arr[mid]<arr[mid-1])
                return mid-1;
            else if(arr[beg]<=arr[mid])
                beg=mid+1;
            else if(arr[beg]>arr[mid])
                end=mid-1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {
       int pivot=findpivot(arr);
        int ans=binarySearch(arr,target,0,pivot);
        if(ans==-1)
            ans=binarySearch(arr,target,pivot+1,arr.length-1);
        return ans;
    }
}