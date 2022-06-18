// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

struct petrolPump
{
    int petrol;
    int distance;
};


 // } Driver Code Ends
/*
The structure of petrolPump is 
struct petrolPump
{
    int petrol;
    int distance;
};*/

/*You are required to complete this method*/
class Solution{
  public:
  
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(petrolPump p[],int n)
    {
       int ans=-1;int acc=0;int flag=0;int i=0;int k=0;int z=0;
       while(k<n&&z<2*n){z++;
          acc+=p[i].petrol-p[i].distance;
          if(acc>=0&&flag==0){
              ans=i;k=0;
              flag=1;
          }
          else if(acc<0){
              ans=-1;flag=0;acc=0;
          }
         i=(i+1)%n;k++;
      }
      if(z>=2*n)ans=-1;
       return ans;
    }
};



// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        petrolPump p[n];
        for(int i=0;i<n;i++)
            cin>>p[i].petrol>>p[i].distance;
        Solution obj;
        cout<<obj.tour(p,n)<<endl;
    }
}
  // } Driver Code Ends