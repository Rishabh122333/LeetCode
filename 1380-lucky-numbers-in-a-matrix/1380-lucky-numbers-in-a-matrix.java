class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row[]=new int[matrix.length];
        int col[]=new int[matrix[0].length];
        List<Integer>ans=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]<min)
                    min=matrix[i][j];
            }
            row[i]=min;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max=0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i]>max)
                    max=matrix[j][i];
            }
            col[i]=max;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==row[i] && matrix[i][j]==col[j])
                    ans.add(matrix[i][j]);
            }
        }
        return ans;
    }
}