class Solution {
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        String[][] arr= {{"1000", "M"}, {"900", "CM"}, {"500", "D"}, {"400", "CD"}, {"100", "C"}, {"90", "XC"}, {"50",             "L"}, {"40", "XL"}, {"10", "X"}, {"9", "IX"}, {"5", "V"}, {"4", "IV"}, {"1", "I"}};
        for (int i = 0; i < 13; i++) {
            int val=Integer.parseInt(arr[i][0]);
            while (num >=val) {
                sb.append(arr[i][1]);
                num -= val;
            }
        }
        return sb.toString();
    }
}