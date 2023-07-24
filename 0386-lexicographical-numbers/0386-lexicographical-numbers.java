class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        print(0,n,list);
        list.remove(0);
        return list;
    }
    public static void print(int curr,int n,List<Integer> list)
    {
        
        if(curr>n)
            return;
        list.add(curr);
        int i=0;
        if(curr==0)
            i=1;
        for(;i<=9;i++)
        {
            print(curr*10+i,n,list);
        }
    }
}