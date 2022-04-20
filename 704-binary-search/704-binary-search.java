import java.util.*;
class Solution {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int target=sc.nextInt();
        System.out.println(search(arr,target));
    }
   public static int search(int arr[], int target) {
       int beg=0,end=arr.length-1;
       if(arr[beg]<arr[end])
       {
       while(beg<=end)
       {
           int mid=beg+(end-beg)/2;
           if(arr[mid]<target)
               beg=mid+1;
           else if(arr[mid]>target)
               end=mid-1;
           else
               return mid; 
       }}
       else
       {
         while(beg<=end)
       {
           int mid=beg+(end-beg)/2;
           if(arr[mid]>target)
               beg=mid+1;
           else if(arr[mid]<target)
               end=mid-1;
           else
               return mid; 
       }
       }
       return -1;
        
    }
}