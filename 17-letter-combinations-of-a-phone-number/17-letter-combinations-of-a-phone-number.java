class Solution {
    public List<String> letterCombinations(String digits) {
      List<String>list=new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
        return numpad("",digits);
    }
    static List<String> numpad(String ans, String str){
        if(str.isEmpty()){
            List<String>list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        List<String>list=new ArrayList<>();
        char ch=str.charAt(0);
        int digit=ch-'0';
        if(ch=='7'){
            for(int i=3*(digit-2);i<=3*(digit-2)+3;i++){
                list.addAll(numpad(ans+(char)('a'+i),str.substring(1)));
            }
        }
        else if(ch=='8'){
            for(int i=3*(digit-2)+1;i<3*(digit-2)+1+3;i++){
                list.addAll(numpad(ans+(char)('a'+i),str.substring(1)));
            }
        }
        else if(ch=='9'){
            for(int i=3*(digit-2)+1;i<=3*(digit-2)+1+3;i++){
                list.addAll(numpad(ans+(char)('a'+i),str.substring(1)));
            }
        }

        else{
            for(int i=3*(digit-2);i<3*(digit-2)+3;i++){
                list.addAll(numpad(ans+(char)('a'+i),str.substring(1)));
            }
        }
        return list;
    }
}