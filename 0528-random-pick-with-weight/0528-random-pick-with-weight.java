class Solution {
    int arr[];
    int sum;
    public Solution(int[] w) {
        arr=new int [w.length];
        sum=0;
        for(int i=0;i<w.length;i++)
        {
            sum+=w[i];
            arr[i]=sum;
        }
    }
    
    public int pickIndex() {
        int n=arr.length;
        int beg=0,end=n-1;
        int x=(int)(Math.random()*sum); // it will generate a random index with in sum's range
        while(beg<end)
        {
            int mid=beg+(end-beg)/2;
            if(arr[mid]<=x)
                beg=mid+1;
            else
                end=mid;
                
        }
        return beg;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */