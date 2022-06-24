// { Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
//User function Template for C++
class Solution {
  public:
    int firstElement(int n) 
    {
        int first = 1, second = 1, t;
        
        for(int i = 2; i < n; i++){
            t = second;
            second = (first + second) % 1000000007;
            first = t;
        }
        return second;
        // code here
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int  n;
        cin >> n ;
        Solution ob;
        cout<<ob.firstElement(n)<<endl;
    }
    return 0;
}
  // } Driver Code Ends