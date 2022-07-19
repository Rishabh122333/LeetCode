class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int a=-1, b=1,start;
        if(n%2==0)
        {
            start=0;
        }
        else
            start=1;
        while (start<n)
        {
            if(start%2==0)
                arr[start]=a--;
            else 
                arr[start]=b++;
            start++;
        }
        return arr;
    }
}