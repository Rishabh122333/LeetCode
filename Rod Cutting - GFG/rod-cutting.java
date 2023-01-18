//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        int []wt=new int[n];
        for(int i=0;i<n;i++)
            wt[i]=i+1;
        int [][] t=new int [price.length+1][n+1]; //price.length=n in most cases
        for(int i=0;i<price.length+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<price.length+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    t[i][j]=Math.max((price[i-1]+t[i][j-wt[i-1]] ), t[i-1][j]);
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[price.length][n];
    }
}