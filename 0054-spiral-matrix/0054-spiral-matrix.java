
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> list=new ArrayList<>();
        int d=0,top=0,left=0,down=m-1,right=n-1;
        while(top<=down && left<=right)
        {
            if(d==0)
            {
                for(int i=left;i<=right;i++)
                    list.add(matrix[top][i]);
                top++;
            }
            else if(d==1)
            {
                for(int i=top;i<=down;i++)
                    list.add(matrix[i][right]);
                right--;
            }
            else if(d==2)
            {
                for(int i=right;i>=left;i--)
                    list.add(matrix[down][i]);
                down--;
            }
            else if(d==3)
            {
                for(int i=down;i>=top;i--)
                    list.add(matrix[i][left]);
                left++;
            }
            d=(d+1)%4;
        }
        return list;
        
    }
}