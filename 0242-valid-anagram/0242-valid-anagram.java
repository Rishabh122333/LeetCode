class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        return generatekey(s).equals(generatekey(t));
        
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
