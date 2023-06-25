class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
     private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;   
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int c = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > (long)2 * arr[right]) right++;
            c += (right - (mid + 1));
        }
        return c;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int c = 0;
        if (low >= high) 
            return c;
        int mid = (low + high) / 2 ;
        c += mergeSort(arr, low, mid);  
        c += mergeSort(arr, mid + 1, high); 
        c += countPairs(arr, low, mid, high); 
        merge(arr, low, mid, high);  
        return c;
    }
}