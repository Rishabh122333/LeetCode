class Solution {
   public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++)
        {
            if(Arrays.deepEquals(mat,target))
            {
                return true;
            }
            mat=rotate(mat);
        }
       return false;
    }
    public static int [][] rotate(int [][]arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length/2; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
            }
        }
        return arr;
    }
}