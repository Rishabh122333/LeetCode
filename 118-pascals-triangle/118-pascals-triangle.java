class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer>a=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j==0||j==i)
                    a.add(1);
                else
                {
                    List<Integer>prev=ans.get(i-1);
                    a.add(prev.get(j-1)+ prev.get(j));
                }
            }
            ans.add(a);
        }
        return ans;
    }
}