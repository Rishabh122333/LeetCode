class Solution {
    public int[][] generateMatrix(int n) {
        int[][]ans=new int[n][n];
        int top=0,down=n-1,left=0,right= n-1,d=0,c=1;
        while (top<=down && left<=right)
        {
            if(d==0)
            {
                for (int i = left; i <=right ; i++) {
                    ans[top][i]=c++;
                }
                top+=1;
            }
            else if(d==1)
            {
                for (int i = top; i <=down ; i++) {
                    ans[i][right]=c++;
                }
                right-=1;
            }
            else if(d==2)
            {
                for (int i = right; i >=left ; i--) {
                    ans[down][i]=c++;
                }
                down-=1;
            }
            else if(d==3)
            {
                for (int i = down; i >=top ; i--) {
                    ans[i][left]=c++;
                }
                left+=1;
            }
            d=(d+1)%4;
        }
        return ans;
    }
}