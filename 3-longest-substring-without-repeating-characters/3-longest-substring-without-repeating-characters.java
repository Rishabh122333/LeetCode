class Solution {
    public int lengthOfLongestSubstring(String s) {
     String subString = "";
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(!subString.contains(Character.toString(s.charAt(i)))){
                subString += s.charAt(i);  
                max = Math.max(max, subString.length()); 
            }else{
                for(int j = subString.length() - 1; j >= 0; j--){
                    if(subString.charAt(j) == s.charAt(i)){
                        if(subString.length() == 1){
                            continue;
                        }else{
                            subString = subString.substring(j+1) + s.charAt(i);
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }
}