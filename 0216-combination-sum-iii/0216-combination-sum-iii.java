class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        boolean board[]=new boolean[9];
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        print(board,n,k,0,0,-1,list,ans);
        return ans;
    }
    
    public static void print(boolean[] board, int n, int k, int npsf, int sum,int idx, List<Integer> list,
            List<List<Integer>> ans) {
                if(npsf==k && sum==n)
                {
                    ans.add(new ArrayList<>(list));
                    return;
                }
                for (int i = idx+1; i < board.length; i++) {
                    if(board[i]==false)
                    {
                        board[i]=true;
                        list.add(i+1);
                        print(board, n, k, npsf+1, sum+(i+1), i, list, ans);
                        board[i]=false;
                        list.remove(list.size()-1);
                    }
                }
    }
}