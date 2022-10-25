class Solution {
    public List<List<Integer>> combine(int n, int k) {
        boolean board[]=new boolean[n];
        List<List<Integer>>ans=new ArrayList<>();
            List<Integer>list=new ArrayList<>();
            print(board,k,0,0,list,ans);
        return ans;
        }
    
        public static void print(boolean[] board, int k,int npsf,int idx,List<Integer>list,List<List<Integer>>ans) {
            if(npsf==k)
            {
                ans.add(new ArrayList<>(list));
                return;
            }
            for (int i = idx+1; i <=board.length; i++) {
                if(board[i-1]==false)
                {
                    board[i-1]=true;
                    list.add(i);
                    print(board, k, npsf+1,i,list,ans);
                    board[i-1]=false;
                    list.remove(list.size()-1);
                }
            }
            }
        }
