class Solution {
    public boolean checkIfPangram(String sentence) {
          if(sentence.length()>=26)
        {
            for (char j='a';j<='z';j++) {
                int f=0;
                for (int i = 0; i < sentence.length(); i++){
                    char ch=sentence.charAt(i);
                    if(ch==j)
                    {
                        f=1;
                        break;
                    }
                }
                if (f==0)
                        return false;
            }
            return true;
        }
        return false;
    }
}