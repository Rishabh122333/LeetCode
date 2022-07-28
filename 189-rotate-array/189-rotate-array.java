class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        if(n==1)
            return;
        for (int i = 0; i <n/2; i++) {
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
        for (int i = 0; i <k/2; i++) {
            int temp=nums[i];
            nums[i]=nums[k-1-i];
            nums[k-1-i]=temp;
        }
        for (int i = 0,j=k; i <(n-k)/2; i++,j++) {
            int temp=nums[j];
            nums[j]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
    }
}