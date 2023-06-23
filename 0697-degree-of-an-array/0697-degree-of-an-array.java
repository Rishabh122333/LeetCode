class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> left=new HashMap<>();
        HashMap<Integer,Integer> right=new HashMap<>();
        int deg=0;
          for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) 
                left.put(x, i);
            right.put(x, i);
            map.put(x, map.getOrDefault(x, 0) + 1);
            if(map.get(x)>deg)
                deg=map.get(x);
        }

        int ans = Integer.MAX_VALUE;
        for (int x: map.keySet()) {
            if (map.get(x) == deg) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}