class Solution {
    static String [] digit={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String str) {
        List<String> list=new ArrayList<>();
        print(str,"",list);
        return list;
    }
    private static void print(String str, String ans, List<String> list) {
        if(str.isEmpty())
        {
            if(!(ans.isEmpty()))
                list.add(ans);
            return;
        }
        String a=digit[str.charAt(0)-'0'];
        for (int i = 0; i < a.length(); i++) {
            print(str.substring(1), ans+a.charAt(i), list);
        }
    }
}