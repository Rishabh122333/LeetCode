class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int beg=0;
        int end =arr.length-1;
        while(beg <end) {
            int mid = beg + (end - beg) / 2;
                if(arr[mid]>arr[mid+1])
                    end =mid;
                else if(arr[mid]<arr[mid+1])
                    beg=mid+1;
            }
        return end;
    }
}