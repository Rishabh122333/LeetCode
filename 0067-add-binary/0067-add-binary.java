class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder() ;
        int i=a.length() -1, j=b.length() -1,carry=0;
        while(i>=0 || j>=0) 
            {
            int sum=carry;
            if(i>=0) 
                {
                sum+=a.charAt(i) -'0';
   i--;
            }
            
            if(j>=0) 
                {
                sum+=b.charAt(j) -'0';
   j--;
            }
            if(sum>1) 
                carry=1;
            else
                carry=0;
            sb. append(sum%2);
        }
        if(carry>0) 
          sb.append(1); 
        return sb. reverse().toString();
    }
}