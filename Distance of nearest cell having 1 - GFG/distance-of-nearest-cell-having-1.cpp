// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution 
{
    public:
    //Function to find distance of nearest 1 in the grid for each cell.
	vector<vector<int>>nearest(vector<vector<int>>M)
	{
	     queue <pair<int,int>> q;
	    vector <pair<int,int>> dir {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	    int n = M.size(), m = M[0].size();
	    vector <vector<int>> v(n, vector <int> (m, INT_MAX));
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            if(M[i][j] == 1){
	                v[i][j] = 0;
	                q.push({i, j});
	            }
	        }
	    }
	    while(!q.empty()){
	        int num = q.size();
	        while(num--){
	            pair <int,int> p = q.front();
	            q.pop();
	            for(auto  i:dir){
	                int x = p.first + i.first;
	                int y = p.second + i.second;
	                if(x >= 0 && x < n && y >= 0 && y < m && v[x][y] > 1+v[p.first][p.second]){
	                    v[x][y] = 1+v[p.first][p.second];
	                    q.push({x, y});
	                }
	            }
	        }
	    }
	    return v;
	}
};

// { Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>>grid(n, vector<int>(m, -1));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				cin >> grid[i][j];
			}
		}
		Solution obj;
		vector<vector<int>> ans = obj.nearest(grid);
		for(auto i: ans){
			for(auto j: i){
				cout << j << " ";
			}
			cout << "\n";
		}
	}
	return 0;
}  // } Driver Code Ends