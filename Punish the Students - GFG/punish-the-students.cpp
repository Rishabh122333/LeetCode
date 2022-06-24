// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{
   public:
    void swap(int a, int b){
        int x = b;
        b = a;
        a = x;
    }
    
    int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int total_count = 0;
        for(int i = 0; i < n; ++i){
            int x = total_count;
            for(int j = 0; j < n; ++j){
                if(roll[j] > roll[j + 1]){
                    swap(roll[j], roll[j + 1]);
                    total_count += 1;
                }
            }
            if(x == total_count){
                break;
            }
        }
        int sum = 0;
        for(int i = 0; i < n; ++i){
            sum += marks[i];
        }
        
        int p_marks = (sum - total_count) / n;
        
        if(p_marks > avg){
            return 1;
        }else{
            return 0;
        }
    }
};

// { Driver Code Starts.
int main()
{
	int t; cin >> t;
	while (t--)
	{
		int n; cin >> n;
		double avg; cin >> avg;

		int roll[n];
		int marks[n];

		for (int i = 0; i < n; ++i)
			cin >> roll[i];
		for (int i = 0; i < n; ++i)
			cin >> marks[i];
        Solution ob;
		cout << ob.shouldPunish (roll, marks, n, avg) << endl;
	}
}
  // } Driver Code Ends