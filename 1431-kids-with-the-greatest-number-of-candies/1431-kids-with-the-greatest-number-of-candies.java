class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          List<Boolean> ans=new ArrayList<>();
        int max=0;
        for (int i:candies) {
            if(i>max)
                max=i;
        }
        for (int i:candies) {
            ans.add((i+extraCandies)>=max);
        }
        return ans;
    }
}