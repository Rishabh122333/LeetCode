class Solution {
    public int countPrimes(int n) {
        return check(n);
    }
    public static int check(int n) {
        if(n<2)
            return 0;
        int c=0;
        boolean arr[]=new boolean[n];
        arr[0]=true;
        arr[1]=true;
        for (int i = 2; i <Math.sqrt(n); i++) {

            if(arr[i]==false)
            {
                for (int j = 2; j*i <n; j++) {
                    arr[i*j]=true;
                }
            }            
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==false)
                c++;
        }
        return c;
    }
}