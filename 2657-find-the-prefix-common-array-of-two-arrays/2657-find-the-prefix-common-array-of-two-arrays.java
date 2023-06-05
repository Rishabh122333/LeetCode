class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[]ans=new int[A.length];
        HashSet<Integer> set=new HashSet<>();
        int c=2;
        for(int i=0;i<A.length;i++)
        {
            set.add(A[i]);
            set.add(B[i]);
            int size=c-set.size();
            ans[i]=size;
            c+=2;
        }
        return ans;
    }
}