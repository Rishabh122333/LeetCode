class Solution {
    public void rotate(int[][] matrix) {
        // transpose and reverse rowwise
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            int j=0,k=n-1;
            while(j<k)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
    }
}