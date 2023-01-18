// Suppose the array is partiotioned in two subsets with sum S1 and S2, so we know that,  
// S1 + S2  is the total sum array nums 
// S1 – S2 is the given diff
// Subtracting the two equations we would get,
// sum – diff = (S1 + S2) – (S1 – S2) = 2*S2 . So, S2 = ( sum – diff ) / 2

class Solution{
   public static int countSubsets(int n, int arr[], int sum){
        int t[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=1;
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];   
    }
  static int countSub(int[] vp, int N, int diff)
{
    int sum = 0; 
    for (int value : vp)
        sum += value;
    if (sum - diff < 0 || (sum - diff) % 2 == 1) {
        return 0;
    }
    return countSubsets(vp.length, vp, (sum - diff) / 2);
}
public static void main(String[] args)
{
    int N = 5;
    int[] arr = { 1, 2, 3, 1, 2 };
    int diff = 1;
    for(int i = 0; i <1001; i++)
    {
        for(int j = 0; j <10000; j++)
        {
            dp[i][j] = -1;
        }
    }
    System.out.print(countSub(arr, N, diff));
}
}
