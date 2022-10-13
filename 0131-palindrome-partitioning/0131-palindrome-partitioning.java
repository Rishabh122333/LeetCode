class Solution {
    public List<List<String>> partition(String str) {
         List<String> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        partitions(str,list,ans);
        return ans;
    }
    public static void partitions(String str,List<String> list,List<List<String>> ans)
    {
        if(str.isEmpty())
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 1; i <=str.length(); i++) {
            String s=str.substring(0, i);
            if(ispalindrome(s))
            {
                list.add(s);
                partitions(str.substring(i),list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}