class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0,down=matrix.length-1,left=0,right= matrix[0].length-1,d=0;
        while (top<=down && left<=right)
        {
            if(d==0)
            {
                for (int i = left; i <=right ; i++) {
                    list.add(matrix[top][i]);
                }
                top+=1;
            }
            else if(d==1)
            {
                for (int i = top; i <=down ; i++) {
                    list.add(matrix[i][right]);
                }
                right-=1;
            }
            else if(d==2)
            {
                for (int i = right; i >=left ; i--) {
                    list.add(matrix[down][i]);
                }
                down-=1;
            }
            else 
            {
                for (int i = down; i >=top ; i--) {
                    list.add(matrix[i][left]);
                }
                left+=1;
            }
            d=(d+1)%4;
        }
        return list;
    }
}