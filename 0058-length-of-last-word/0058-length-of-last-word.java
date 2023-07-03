class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int idx=s.lastIndexOf(' ');
        return s.length()-1-idx;
    }
}