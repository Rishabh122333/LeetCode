class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        solve(n,0,list);
        list.remove(0);
        return list;
    }
    public static void solve(int n, int curr,List<Integer> list) {
    if(curr>n)
       return;
    list.add(curr);
    int i=(curr==0)? 1:0;
    for(;i<=9;i++)
    {
        solve(n, curr*10+i,list);
    }
    }
}