class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String str=generatekey(strs[i]);
            if(!map.containsKey(str))
            {
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        for(String str:map.keySet())
        {
            ans.add(new ArrayList<>(map.get(str)));
        }
        return ans;
    }
    public static String generatekey(String str)
    {
        StringBuffer sb=new StringBuffer();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
            sb.append(freq[i]+" ");
        return sb.toString();
    }
}