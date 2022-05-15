class Solution {
    public int[] twoSum(int[] a, int target) {
       for(int i = 0 ; i < a.length - 1 ; i++)
            for(int j = i + 1 ; j < a.length ; j++)
            {
                if(a[i] + a[j] == target)
                    return new int[]{i , j };
            }
        return new int[]{-1 , -1};
    }
}