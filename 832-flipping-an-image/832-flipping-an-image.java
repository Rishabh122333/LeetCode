class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for (int []a:arr) {
            for (int i = 0; i < (arr[0].length+1)/2; i++) {
                int temp=a[i]^1;
                a[i]=a[arr[0].length-i-1]^1;
                a[arr[0].length-i-1]=temp;
            }
        }
        return arr;
    }
}