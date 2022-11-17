class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (isValid(l)) {
                if (isValid(r)) {
                    if (l != r) return false;
                } else {
                    right--;
                    continue;
                }
            } else {
                left++;
                continue;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isValid(char c) {
        return c >= 'a' &&  c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }
}