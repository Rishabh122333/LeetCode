class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0],str2=strs[strs.length-1];
        StringBuffer sb=new StringBuffer();
        int n=Math.min(str1.length(),str2.length());
        for(int i=0;i<n;i++)
        {
            if(str1.charAt(i)==str2.charAt(i))
                sb.append(str1.charAt(i));
            else
                break;
        }
        return sb.toString();
    }
}